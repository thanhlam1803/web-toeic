package com.sangtt.toeic_test.service.impl;

import com.sangtt.toeic_test.domain.GrammarQuestion;
import com.sangtt.toeic_test.domain.Vocabulary;
import com.sangtt.toeic_test.repository.VocabularyRepository;
import com.sangtt.toeic_test.service.VocabularyService;
import com.sangtt.toeic_test.service.dto.VocabularyDTO;
import com.sangtt.toeic_test.service.mapper.VocabularyMapper;

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
 * Service Implementation for managing {@link Vocabulary}.
 */
@Service
@Transactional
public class VocabularyServiceImpl implements VocabularyService {

    private final Logger log = LoggerFactory.getLogger(VocabularyServiceImpl.class);

    private final VocabularyRepository vocabularyRepository;

    private final VocabularyMapper vocabularyMapper;

    public VocabularyServiceImpl(VocabularyRepository vocabularyRepository, VocabularyMapper vocabularyMapper) {
        this.vocabularyRepository = vocabularyRepository;
        this.vocabularyMapper = vocabularyMapper;
    }

    @Override
    public VocabularyDTO save(Vocabulary vocabularyDTO) {
        log.debug("Request to save Vocabulary : {}", vocabularyDTO);
        Vocabulary vocabulary = vocabularyRepository.save(vocabularyDTO);
        return vocabularyMapper.toDto(vocabulary);
    }

    @Override
    public Optional<VocabularyDTO> partialUpdate(VocabularyDTO vocabularyDTO) {
        log.debug("Request to partially update Vocabulary : {}", vocabularyDTO);

        return vocabularyRepository
            .findById(vocabularyDTO.getId())
            .map(existingVocabulary -> {
                vocabularyMapper.partialUpdate(existingVocabulary, vocabularyDTO);

                return existingVocabulary;
            })
            .map(vocabularyRepository::save)
            .map(vocabularyMapper::toDto);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Vocabulary> findAll(Pageable pageable) {
        log.debug("Request to get all Vocabularies");
        return vocabularyRepository.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<VocabularyDTO> findOne(Long id) {
        log.debug("Request to get Vocabulary : {}", id);
        return vocabularyRepository.findById(id).map(vocabularyMapper::toDto);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Vocabulary : {}", id);
        vocabularyRepository.deleteById(id);
    }

    @Override
    public List<QuestionModel> findQuestionTopic(Long id) {
        log.debug("Request to get findVocabQuestionTopic : {}", id);
        List<Vocabulary> vocabularies = vocabularyRepository.findAll();
        vocabularies = vocabularies.stream().filter(x->x.getVocabularyTopic().getId() == id).collect(Collectors.toList());
        List<QuestionModel> questions = new ArrayList<>();

        for (Vocabulary vocabulary : vocabularies){
            List<Proposition> propositions = new ArrayList<>();
            if (vocabulary.getAnswerA().equals(vocabulary.getMean())){
                propositions.add(new Proposition(vocabulary.getAnswerA(),true));
            }else {
                propositions.add(new Proposition(vocabulary.getAnswerA(),false));
            }
            if (vocabulary.getAnswerB().equals(vocabulary.getMean())){
                propositions.add(new Proposition(vocabulary.getAnswerB(),true));
            }else {
                propositions.add(new Proposition(vocabulary.getAnswerB(),false));
            }
            if (vocabulary.getAnswerC().equals(vocabulary.getMean())){
                propositions.add(new Proposition(vocabulary.getAnswerC(),true));
            }else {
                propositions.add(new Proposition(vocabulary.getAnswerC(),false));
            }
            if (vocabulary.getAnswerD().equals(vocabulary.getMean())){
                propositions.add(new Proposition(vocabulary.getAnswerD(),true));
            }else {
                propositions.add(new Proposition(vocabulary.getAnswerD(),false));
            }


            QuestionModel questionModel = new QuestionModel(vocabulary.getWord(), propositions);
            questions.add(questionModel);
        }


        return questions;
    }

    @Override
    public List<Vocabulary> findAllById(Long id) {
        log.debug("Request to get findAllById");
        List<Vocabulary> vocabularies = vocabularyRepository.findAll();
        vocabularies = vocabularies.stream().filter(x->x.getVocabularyTopic().getId() == id).collect(Collectors.toList());
        return vocabularies;
    }
}
