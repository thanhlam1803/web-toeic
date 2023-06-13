package com.sangtt.toeic_test.service.impl;

import com.sangtt.toeic_test.domain.GrammarAnswer;
import com.sangtt.toeic_test.domain.GrammarQuestion;
import com.sangtt.toeic_test.repository.GrammarAnswerRepository;
import com.sangtt.toeic_test.repository.GrammarQuestionRepository;
import com.sangtt.toeic_test.service.GrammarQuestionService;
import com.sangtt.toeic_test.service.dto.GrammarQuestionDTO;
import com.sangtt.toeic_test.service.mapper.GrammarQuestionMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.sangtt.toeic_test.service.model.Proposition;
import com.sangtt.toeic_test.service.model.QuestionModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link GrammarQuestion}.
 */
@Service
@Transactional
public class GrammarQuestionServiceImpl implements GrammarQuestionService {

    private final Logger log = LoggerFactory.getLogger(GrammarQuestionServiceImpl.class);

    private final GrammarQuestionRepository grammarQuestionRepository;

    private final GrammarAnswerRepository grammarAnswerRepository;

    private final GrammarQuestionMapper grammarQuestionMapper;

    public GrammarQuestionServiceImpl(GrammarQuestionRepository grammarQuestionRepository, GrammarAnswerRepository grammarAnswerRepository, GrammarQuestionMapper grammarQuestionMapper) {
        this.grammarQuestionRepository = grammarQuestionRepository;
        this.grammarAnswerRepository = grammarAnswerRepository;
        this.grammarQuestionMapper = grammarQuestionMapper;
    }

    @Override
    public GrammarQuestionDTO save(GrammarQuestionDTO grammarQuestionDTO) {
        log.debug("Request to save GrammarQuestion : {}", grammarQuestionDTO);
        GrammarQuestion grammarQuestion = grammarQuestionMapper.toEntity(grammarQuestionDTO);
        grammarQuestion = grammarQuestionRepository.save(grammarQuestion);
        return grammarQuestionMapper.toDto(grammarQuestion);
    }

    @Override
    public Optional<GrammarQuestionDTO> partialUpdate(GrammarQuestionDTO grammarQuestionDTO) {
        log.debug("Request to partially update GrammarQuestion : {}", grammarQuestionDTO);

        return grammarQuestionRepository
            .findById(grammarQuestionDTO.getId())
            .map(existingGrammarQuestion -> {
                grammarQuestionMapper.partialUpdate(existingGrammarQuestion, grammarQuestionDTO);

                return existingGrammarQuestion;
            })
            .map(grammarQuestionRepository::save)
            .map(grammarQuestionMapper::toDto);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<GrammarQuestionDTO> findAll(Pageable pageable) {
        log.debug("Request to get all GrammarQuestions");
        return grammarQuestionRepository.findAll(pageable).map(grammarQuestionMapper::toDto);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<GrammarQuestionDTO> findOne(Long id) {
        log.debug("Request to get GrammarQuestion : {}", id);
        return grammarQuestionRepository.findById(id).map(grammarQuestionMapper::toDto);
    }

    @Override
    @Transactional(readOnly = true)
    public List<QuestionModel> findGrammarTopic(Long id) {
        log.debug("Request to get findGrammarTopic : {}", id);
        List<GrammarQuestion> grammarQuestionDTOS = grammarQuestionRepository.findAll();
        grammarQuestionDTOS = grammarQuestionDTOS.stream().filter(x->x.getGrammarTopic().getId() == id).collect(Collectors.toList());
        List<QuestionModel> questions = new ArrayList<>();
        for (GrammarQuestion grammarQuestion : grammarQuestionDTOS){
            List<Proposition> propositions = new ArrayList<>();
            if (grammarQuestion.getGrammarAnswer().getAnswerA().equals(grammarQuestion.getCorrect())){
                propositions.add(new Proposition(grammarQuestion.getGrammarAnswer().getAnswerA(),true));
            }else {
                propositions.add(new Proposition(grammarQuestion.getGrammarAnswer().getAnswerA(),false));
            }
            if (grammarQuestion.getGrammarAnswer().getAnswerB().equals(grammarQuestion.getCorrect())){
                propositions.add(new Proposition(grammarQuestion.getGrammarAnswer().getAnswerB(),true));
            }else {
                propositions.add(new Proposition(grammarQuestion.getGrammarAnswer().getAnswerB(),false));
            }
            if (grammarQuestion.getGrammarAnswer().getAnswerC().equals(grammarQuestion.getCorrect())){
                propositions.add(new Proposition(grammarQuestion.getGrammarAnswer().getAnswerC(),true));
            }else {
                propositions.add(new Proposition(grammarQuestion.getGrammarAnswer().getAnswerC(),false));
            }
            if (grammarQuestion.getGrammarAnswer().getAnswerD().equals(grammarQuestion.getCorrect())){
                propositions.add(new Proposition(grammarQuestion.getGrammarAnswer().getAnswerD(),true));
            }else {
                propositions.add(new Proposition(grammarQuestion.getGrammarAnswer().getAnswerD(),false));
            }


            QuestionModel questionModel = new QuestionModel(grammarQuestion.getQuestion(), propositions);
            questions.add(questionModel);
        }


        return questions;
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete GrammarQuestion : {}", id);
        grammarQuestionRepository.deleteById(id);
    }
}
