<template>
  <div class="gramTopic row">

    <!--tieu de-->
    <div class="title">
      <h1 class="display-4" v-text="$t('finalProjectApp.userGrammarList.grammar.title')">Grammar</h1>
      <div>
        <div class="el-breadcrumb">
          <span class="el-breadcrumb__item">
            <router-link class="item" to="/" v-text="$t('home.about.home')">Home</router-link>
            <span class="el-breadcrumb__separator">/</span>
          </span>
          <span class="el-breadcrumb__item">
            <router-link class="item" to="/users/grammar" v-text="$t('finalProjectApp.userGrammarList.grammar.topicList')">Grammar Topic List</router-link>
            <span class="el-breadcrumb__separator">/</span>
          </span>
          <span class="el-breadcrumb__item">
            <router-link class="item" to="/users/grammar/gramTopic" v-text="$t('finalProjectApp.userGrammarList.grammar.topic02.title')">Simple Present & Present Continuous</router-link>
            <span class="el-breadcrumb__separator">/</span>
          </span>
        </div>
      </div>
    </div>

    <!--ly thuyet-->
    <div class="container">
      <h2>{{grammarTopic.nameTopic}}</h2>
      <div v-html = "grammarTopic.description"></div>
    </div>

    <!-- button -->
    <div class="container">
      <div class="btn-footer">
        <div class="btn-quiz">
          <el-row>
            <router-link class="alert-link" to="" style="width: 300px; font-weight: bold; font-size: 18px;">Homework Link</router-link>
            <router-link class="alert-link" to="/users/grammar/gramTopic/gramQuiz" style="width: 300px; font-weight: bold; font-size: 18px;">Quiz</router-link>
          </el-row>
        </div>
      </div>
    </div>

  </div>
</template>


<script lang="ts" src="./gramTopic.component.ts"></script>
<script>
import axios from "axios";

export default {
  data() {
    return {
      grammarTopic: '',
    }
  },

  name: 'grammarTopic',

  mounted() {
    this.fetchData();
  },

  methods: {

    async fetchData() {
      console.log('query','http://localhost:9000/api/grammar-topics' + "/" + this.$route.query.topic);
      await axios.get('http://localhost:9000/api/grammar-topics' + "/" + this.$route.query.topic).then(
        res=>{
          this.grammarTopic=res.data
          console.log('grammar topic', this.grammarTopic)
        })
    },

    selectResponse(e) {
      this.correct = true;
      this.next = false;
      if(e.correct) {
        this.score++;
      }
    },

    check(status) {
      if(status.correct) {
        return 'correct'
      }else {
        return 'incorrect'
      }
    },

    nextQuestion() {
      if(this.next) {
        return;
      }
      this.progress = this.progress + (100/this.questionApi.length);
      if(this.questionApi.length - 1 == this.a) {
        this.score_show = true;
        this.quiz = false;
      }else {
        this.a++;
        this.b++;
        this.correct = false;
        this.next = true;
      }
    },

    skipQuestion() {
      if(!this.next) {
        return;
      }
      this.progress = this.progress + (100/this.questionApi.length);
      if(this.questionApi.length - 1 == this.a) {
        this.score_show = true;
        this.quiz = false;
      }else {
        this.a++;
        this.b++;
      }
    },

    restartQuiz() {
      Object.assign(this.$data, this.$options.data()); // reset data in vue
    },

  }
}

</script>

<style scoped>
/**/
.title {
  color: #ffffff;
  width: 100%;
  height: 150px;
  background-image: linear-gradient(to bottom right, #5B247A, #1BCEDF);
  padding-top: 30px;
  padding-left: 100px;
}
.el-breadcrumb {
  padding-top: 10px;
  font-size: 14px;
  line-height: 1px;
}
.el-breadcrumb:before {
  display: table;
  content: "";
}
.item {
  color: #ffffff;
  font-weight: 700;
  text-decoration: none;
}
.item:hover {
  text-decoration: none;
  color: #ffffff;
  font-weight: 700;
}
.el-breadcrumb__separator {
  margin: 0 9px;
  font-weight: 700;
  color: #c0c4cc;
}

/**/
h2 {
  text-align: center;
  font-weight: bold;
  margin-top: 30px;
  margin-bottom: 15px;
}
.list {

}
.list p {
  text-indent: 30px;
  text-align: left;
  line-height: 20px;
}
.list table {
  border-collapse: collapse;
  width: 100%;
}
.list td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
  border:1px solid black;
}
.list th {
  text-align: center;
}
.list tr:nth-child(even) {
  background-color: #d6d5fc;
}
.list ul {

}
.list ul li {
}

.diss ul li {
  list-style: none;
}


.btn-footer {

}
.btn-quiz {
  margin-top: 40px;
  margin-bottom: 90px;
  text-align: center;
}
.btn-quiz .alert-link {
  border: 1px solid #3e8acc;
  border-radius: 5px;
  margin: 0 200px;
  padding: 10px 20px
}
</style>

