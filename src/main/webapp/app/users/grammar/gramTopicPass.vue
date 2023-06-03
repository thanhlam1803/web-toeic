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
      <h2>Hiện tại hoàn thành<br>&<br>Hiện tại hoàn thành tiếp diễn</h2>
      <div class="list">
        <p>Thì Hiện tại hoàn thành và thì Hiện tại hoàn thành tiếp diễn thường khiến nhiều bạn lẫn lộn trong bài
          thi, không biết chúng khác nhau cái gì trong cấu trúc và ý nghĩa. Vì vậy, chúng ta cùng
          xem lại kiến thức về thì Hiện tại hoàn thành và thì Hiện tại hoàn thành tiếp diễn nhé. Các bạn cần nắm chắc
          cấu tạo, chức năng của 2 thì này để làm nền tảng cho những phần tiếp theo.</p>
        <br>
        <strong>I. Dấu hiệu nhận biết</strong>
        <table>
          <tr>
            <th><b>Hiện tại hoàn thành</b></th>
            <th><b>Hiện tại hoàn thành tiếp diễn</b></th>
          </tr>
          <tr>
            <td>
              <ul>
                <li>Just: mới</li>
                <li>Already: rồi</li>
                <li>Recently = Lately: Gần đây</li>
                <li>Since + mốc thời gian: Từ khi…For + khoảng thời gian: trong…</li>
                <li>Never…before: chưa từng…trước đây</li>
                <li>So far = Until now = Up to now = Up to the present: cho đến bây giờ</li>
                <li>Cấu trúc so sánh hơn nhất: the + Adj-est/the + most + Adj.</li>
              </ul>
            </td>
            <td>
              <ul>
                <li>Các động từ chỉ hành động, sự việc có tính lâu dài, nhấn mạnh vào thời gian: work, live, study,…</li>
                <li>Các cụm từ chỉ thời gian: all the morning, all the afternoon, all day long, since, for, how long,…</li>
              </ul>
            </td>
          </tr>
        </table>
        <br>
        <strong>II. Cấu Trúc</strong>
        <p>Chúng ta sẽ cùng xem cấu trúc của hiện tại đơn và hiện tại tiếp diễn trong bảng
          sau nhé:</p>
        <table class="diss">
          <tr>
            <th></th>
            <th><b>Hiện tại hoàn thành</b></th>
            <th><b>Hiện tại hoàn thành tiếp diễn</b></th>
          </tr>
          <tr>
            <td>
              <ul>
                <li>+</li>
                <br/>
                <li>-</li>
                <br/>
                <li>?</li>
              </ul>
            </td>
            <td>
              <ul>
                <li>S + have / has + V(p2)<br>E.g: My mom has worked as a teacher for 10 years.(Mẹ tôi đã làm nghề giáo viên trong 10 năm.)</li>
                <br/>
                <li>S + have / has + not + V(p2)<br>E.g: My mom has not worked as a teacher for 3 years.(Mẹ tôi không còn làm nghề giáo viên được 3 năm rồi.)</li>
                <br/>
                <li>Have/ Has + S + V(p2)?<br>E.g: Has your mom worked as a teacher for 10 years?(Mẹ của bạn đã làm nghề giáo viên được 10 năm rồi phải không?)</li>
              </ul>
            </td>
            <td>
              <ul>
                <li>S + have / has + been + V-ing<br>E.g: He has been running all afternoon.(Anh ấy đã chạy hết cả buổi chiều.)</li>
                <br/>
                <li>S + haven’t / hasn’t + been + V-ing<br>E.g: They haven’t been doing homework all day.(Họ đã không làm bài tập cả ngày.)</li>
                <br/>
                <li>Have / has + S + been + V-ing?<br>E.g: Has she been teaching for 15 years?(Cô ấy đã dạy được 15 năm rồi phải không?)</li>
              </ul>
            </td>
          </tr>
        </table>
        <br>
        <strong>III. Cách sử dụng</strong>
        <table>
          <tr>
            <th><b>Hiện tại hoàn thành</b></th>
            <th><b>Hiện tại hoàn thành tiếp diễn</b></th>
          </tr>
          <tr>
            <td>
              <ol>
                <li>
                  <i>Diễn tả một hành động đã xảy ra ở quá khứ nhưng không biết chính xác thời điểm xảy ra.</i>
                  <ul>
                    E.g: Someone has broken the window. (Ai đó đã làm vỡ cửa sổ.)
                  </ul>
                </li>
                <li>
                  <i>Diễn tả một hành động đã xảy ra ở quá khứ nhưng còn kéo dài đến hiện tại và có khả năng tiếp tục trong tương lai.</i>
                  <ul>
                    E.g:  I have known my best friend Liz for 7 years. (Tôi quen bạn thân của tôi Liz 7 năm rồi.)
                  </ul>
                </li>

              </ol>
            </td>
            <td>
              <ol>
                <li>
                  <i>Diễn tả một hành động đã xảy ra trong quá khứ nhưng để lại kết quả ở hiện tại.</i>
                  <ul>
                    E.g: I am too tired. I have been working all day.(Tôi rất mệt. Tôi đã làm việc hết cả ngày.)
                  </ul>
                </li>
                <li>
                  <i>Diễn tả một hành động đã xảy ra trong quá khứ và kéo dài cho đến hiện tại.</i>
                  <ul>
                    E.g: She has been waiting for him all day long.(Cô ấy đã đợi anh ấy cả ngày.)
                  </ul>
                </li>
              </ol>
            </td>
          </tr>
        </table>
        <p>
          <br/>
          Lưu ý: Những cách dùng khác của thì Hiện tại hoàn thành
          <br/>
          Đề cập một hành động xảy ra nhiều lần mang tính lặp lại cho đến hiện tại.
          E.g: She has read this book several times. (Cô ấy đọc cuốn sách này nhiều lần rồi.)
          <br/>
          Thể hiện kinh nghiệm, trải nghiệm của một cá nhân.
          E.g: This is the first time I have been to Paris. (Đây là lần đầu tiên tôi được đến Paris.)
          <br/>
          Diễn tả các hành động bắt đầu và kết thúc trong quá khứ nhưng hậu quả và ảnh hưởng có liên quan đến hiện tại.
          E.g: I have lost my keys. I don’t know how to get into my house. (Tôi đã làm mất chìa khóa. Tôi không biết làm thế nào để vào nhà.)
          <br/>
        </p>
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

