import Vue from 'vue';
import Component from 'vue-class-component';
Component.registerHooks([
  'beforeRouteEnter',
  'beforeRouteLeave',
  'beforeRouteUpdate', // for vue-router 2.2+
]);
import Router, { RouteConfig } from 'vue-router';

const Home = () => import('@/core/home/home.vue');
const Error = () => import('@/core/error/error.vue');
const About = () => import('@/users/about/about.vue');
const Contact = () => import('@/users/contact/contact.vue');

const ContactSend = () => import('@/users/contact/contactSend.vue')
const QnA = () => import('@/users/qna/qna.vue');
const Question = () => import('@/users/qna/question.vue');
const QuestionSend = () => import('@/users/qna/questionSend.vue');

import account from '@/router/account';
import admin from '@/router/admin';
import entities from '@/router/entities';
import pages from '@/router/pages';
import users from '@/router/users';

Vue.use(Router);

// prettier-ignore
const router = new Router({
  mode: 'history',
  routes: [
    {
      path: '/',
      name: 'Home',
      component: Home
    },
    {
      path: '/forbidden',
      name: 'Forbidden',
      component: Error,
      meta: { error403: true }
    },
    {
      path: '/not-found',
      name: 'NotFound',
      component: Error,
      meta: { error404: true }
    },
    {
      path: '/about',
      name: 'About',
      component: About,
    },
    {
      path: '/contact',
      name: 'Contact',
      component: Contact,
    },
    {
      path: '/contact/send',
      name: 'ContactSend',
      component: ContactSend,
    },
    {
      path: '/qna',
      name: 'QnA',
      component: QnA,
    },
    {
      path: '/question',
      name: 'question',
      component: Question,
    },
    {
      path: '/question/send',
      name: 'questionsend',
      component: QuestionSend,
    },

    ...account,
    ...admin,
    entities,
    ...pages,
    ...users
  ]
});

export default router;
