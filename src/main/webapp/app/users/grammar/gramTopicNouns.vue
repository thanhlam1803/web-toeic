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
      <h2>Danh từ</h2>
      <div class="list">
        <p>Nắm vững các loại từ trong tiếng Anh là phần quan trọng để đặt nền tảng cho các bạn phát triển vốn ngữ pháp của mình khi luyện thi TOEIC.
          Bài học hôm nay sẽ giúp bạn củng cố kiến thức về danh từ cũng như cách sử dụng các loại danh từ khi luyện thi TOEIC như thế nào nhằm học tập đúng hướng và hiệu quả hơn, luyện thi TOEIC tốt hơn.</p>
        <br>
        <strong>Noun là gì ? Vị trí và loại danh từ</strong>
        <br/>
        <strong>Noun – Danh từ là gì?</strong>
        <br/>
        <p>
          Noun – Danh từ trong tiếng Anh tương tự với tiếng Việt dùng để chỉ sự vật, sự việc, con người. Danh từ được sử dụng trong câu với những vị trí khác nhau.
          Danh từ chia thành 5 loại trong đó có danh từ chung, danh từ riêng, danh từ trừu tượng, tập hợp và danh từ ghép. Danh từ trong tiếng anh.  Danh từ trong tiếng Anh phân biệt danh từ đếm được và không đếm được. Cụ thể như sau:
        </p>
        <strong>Countable nouns (Danh từ đếm được)</strong>
       <ul>
         <li>
           Tồn tại ở cả 2 dạng: số ít và số nhiều (a house, some houses). Tuy nhiên, có những danh từ chỉ có dạng số nhiều (socks, trousers).
         </li>
         <li>
           Các danh từ này có thể được chia động từ số ít hoặc số nhiều.

           E.g: The house is big.

           The houses in the neighborhood are very big.
         </li>
         <li>
           Các danh từ này có thể được thay thế bằng đại từ số ít hoặc số nhiều.

           E.g: The notebook is Jack’s. It is so beautiful!

           These notebooks are Jack’s. They are so colorful!
         </li>
         <li>
           Dạng số ít của danh từ có thể đứng sau các mạo từ a, an, the. (a bike, an apple, the tree)
         </li>
       </ul>

        <strong>Uncountable nouns (Danh từ không đếm được)</strong>
        <ul>
          <li>
            Có một số danh từ không đếm được có dạng số nhiều (maths, physics, news).
          </li>
          <li>
            Chỉ được chia động từ số ít.

            E.g: The news brings sadness to me and my friends.
          </li>
          <li>
            Chỉ có thể được thay thế bằng đại từ số ít.

            E.g: My most favorite subject is Physics. It is so interesting.
          </li>
          <li>
            Chỉ có thể đo đếm qua các đơn vị đo lường cụ thể và đếm được (a bottle of water, a piece of paper, a bar of soap)
          </li>
          <li>
            Không thể đứng sau các mạo từ a, an. (hair, không phải a hair)
          </li>
        </ul>
        <strong>Vị trí trong câu</strong>
        <ul>
          <li>
            Danh từ là chủ ngữ đứng trước động từ chính.

            Ví dụ: Approximately 2000 people went to the concert.
          </li>
          <li>
            Danh từ là tân ngữ (direct object) đứng sau động từ chính.

            Ví dụ: Doing exercise brings many benefits to our health.
          </li>
          <li>
            Danh từ là tân ngữ của giới từ (object of preposition) đứng trong cụm giới từ.

            Ví dụ: Global warming has affected the lives of many people on Earth.
          </li>
        </ul>
        <strong>Tạo danh từ từ danh từ</strong>
        <br/>
        <b>(A/an/the) + Noun1 + Noun2</b>
        <ul>
          <li>Noun1: Đóng vai trò như tính từ bổ nghĩa cho Noun2</li>
          <li>Noun2: Danh từ chính</li>
        </ul>

        Ví dụ:
        <ul>
          <li>The <b>city center</b> (Trung tâm thành phố)</li>
          <li>A <b>taxi driver</b> (Người lái xe taxi)</li>
        </ul>

        <strong>Tạo danh từ từ V-ing</strong>
        <br/>
        Những danh từ có V-ing đứng trước thường để biểu thị mục đích sử dụng của danh từ đó.

        Ví dụ:

        <ul>
          <li>A <b>frying pan</b> (= a pan used for frying)</li>
          <li>A <b>washing machine</b>  (= a machine used for washing clothes)</li>
        </ul>

        <strong>Tạo danh từ từ số đếm (Dạng: Number + Noun + Noun)</strong>
        <ul>
          Ví dụ:
          <li>A <b>ten-hour flight</b> (Chuyến bay kéo dài 10 tiếng)</li>
          <li>A <b>seven-storey building</b> (Tòa nhà cao 7 tầng)</li>
          <li>A <b>four hundred-page dictionary</b> (Quyển từ điển dày 400 trang)</li>
          <li>A <b>ten-year old boy</b> (Cậu bé 10 tuổi)</li>
        </ul>

        <strong>Lưu ý:</strong>

        Danh từ đứng liền sau số đếm và dấu gạch ngang Ở DẠNG SỐ ÍT. (A ten-year old boy)

        <br>
      </div>
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


<style scoped>
/**/
.title {
  color: #ffffff;
  width: 100%;
  height: 150px;
  background-image: linear-gradient(to bottom right, #003c72, #c000de);
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

