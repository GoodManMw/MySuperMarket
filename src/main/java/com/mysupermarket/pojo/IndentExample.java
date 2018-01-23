package com.mysupermarket.pojo;

import java.util.ArrayList;
import java.util.List;

public class IndentExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table indent
     *
     * @mbggenerated Sat Aug 12 21:19:47 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table indent
     *
     * @mbggenerated Sat Aug 12 21:19:47 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table indent
     *
     * @mbggenerated Sat Aug 12 21:19:47 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indent
     *
     * @mbggenerated Sat Aug 12 21:19:47 CST 2017
     */
    public IndentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indent
     *
     * @mbggenerated Sat Aug 12 21:19:47 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indent
     *
     * @mbggenerated Sat Aug 12 21:19:47 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indent
     *
     * @mbggenerated Sat Aug 12 21:19:47 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indent
     *
     * @mbggenerated Sat Aug 12 21:19:47 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indent
     *
     * @mbggenerated Sat Aug 12 21:19:47 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indent
     *
     * @mbggenerated Sat Aug 12 21:19:47 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indent
     *
     * @mbggenerated Sat Aug 12 21:19:47 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indent
     *
     * @mbggenerated Sat Aug 12 21:19:47 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indent
     *
     * @mbggenerated Sat Aug 12 21:19:47 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indent
     *
     * @mbggenerated Sat Aug 12 21:19:47 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table indent
     *
     * @mbggenerated Sat Aug 12 21:19:47 CST 2017
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIIdIsNull() {
            addCriterion("i_id is null");
            return (Criteria) this;
        }

        public Criteria andIIdIsNotNull() {
            addCriterion("i_id is not null");
            return (Criteria) this;
        }

        public Criteria andIIdEqualTo(Integer value) {
            addCriterion("i_id =", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdNotEqualTo(Integer value) {
            addCriterion("i_id <>", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdGreaterThan(Integer value) {
            addCriterion("i_id >", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_id >=", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdLessThan(Integer value) {
            addCriterion("i_id <", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdLessThanOrEqualTo(Integer value) {
            addCriterion("i_id <=", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdIn(List<Integer> values) {
            addCriterion("i_id in", values, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdNotIn(List<Integer> values) {
            addCriterion("i_id not in", values, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdBetween(Integer value1, Integer value2) {
            addCriterion("i_id between", value1, value2, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdNotBetween(Integer value1, Integer value2) {
            addCriterion("i_id not between", value1, value2, "iId");
            return (Criteria) this;
        }

        public Criteria andIUseraccountIsNull() {
            addCriterion("i_useraccount is null");
            return (Criteria) this;
        }

        public Criteria andIUseraccountIsNotNull() {
            addCriterion("i_useraccount is not null");
            return (Criteria) this;
        }

        public Criteria andIUseraccountEqualTo(Integer value) {
            addCriterion("i_useraccount =", value, "iUseraccount");
            return (Criteria) this;
        }

        public Criteria andIUseraccountNotEqualTo(Integer value) {
            addCriterion("i_useraccount <>", value, "iUseraccount");
            return (Criteria) this;
        }

        public Criteria andIUseraccountGreaterThan(Integer value) {
            addCriterion("i_useraccount >", value, "iUseraccount");
            return (Criteria) this;
        }

        public Criteria andIUseraccountGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_useraccount >=", value, "iUseraccount");
            return (Criteria) this;
        }

        public Criteria andIUseraccountLessThan(Integer value) {
            addCriterion("i_useraccount <", value, "iUseraccount");
            return (Criteria) this;
        }

        public Criteria andIUseraccountLessThanOrEqualTo(Integer value) {
            addCriterion("i_useraccount <=", value, "iUseraccount");
            return (Criteria) this;
        }

        public Criteria andIUseraccountIn(List<Integer> values) {
            addCriterion("i_useraccount in", values, "iUseraccount");
            return (Criteria) this;
        }

        public Criteria andIUseraccountNotIn(List<Integer> values) {
            addCriterion("i_useraccount not in", values, "iUseraccount");
            return (Criteria) this;
        }

        public Criteria andIUseraccountBetween(Integer value1, Integer value2) {
            addCriterion("i_useraccount between", value1, value2, "iUseraccount");
            return (Criteria) this;
        }

        public Criteria andIUseraccountNotBetween(Integer value1, Integer value2) {
            addCriterion("i_useraccount not between", value1, value2, "iUseraccount");
            return (Criteria) this;
        }

        public Criteria andIReceiveIsNull() {
            addCriterion("i_receive is null");
            return (Criteria) this;
        }

        public Criteria andIReceiveIsNotNull() {
            addCriterion("i_receive is not null");
            return (Criteria) this;
        }

        public Criteria andIReceiveEqualTo(Integer value) {
            addCriterion("i_receive =", value, "iReceive");
            return (Criteria) this;
        }

        public Criteria andIReceiveNotEqualTo(Integer value) {
            addCriterion("i_receive <>", value, "iReceive");
            return (Criteria) this;
        }

        public Criteria andIReceiveGreaterThan(Integer value) {
            addCriterion("i_receive >", value, "iReceive");
            return (Criteria) this;
        }

        public Criteria andIReceiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_receive >=", value, "iReceive");
            return (Criteria) this;
        }

        public Criteria andIReceiveLessThan(Integer value) {
            addCriterion("i_receive <", value, "iReceive");
            return (Criteria) this;
        }

        public Criteria andIReceiveLessThanOrEqualTo(Integer value) {
            addCriterion("i_receive <=", value, "iReceive");
            return (Criteria) this;
        }

        public Criteria andIReceiveIn(List<Integer> values) {
            addCriterion("i_receive in", values, "iReceive");
            return (Criteria) this;
        }

        public Criteria andIReceiveNotIn(List<Integer> values) {
            addCriterion("i_receive not in", values, "iReceive");
            return (Criteria) this;
        }

        public Criteria andIReceiveBetween(Integer value1, Integer value2) {
            addCriterion("i_receive between", value1, value2, "iReceive");
            return (Criteria) this;
        }

        public Criteria andIReceiveNotBetween(Integer value1, Integer value2) {
            addCriterion("i_receive not between", value1, value2, "iReceive");
            return (Criteria) this;
        }

        public Criteria andIGoodIsNull() {
            addCriterion("i_good is null");
            return (Criteria) this;
        }

        public Criteria andIGoodIsNotNull() {
            addCriterion("i_good is not null");
            return (Criteria) this;
        }

        public Criteria andIGoodEqualTo(Integer value) {
            addCriterion("i_good =", value, "iGood");
            return (Criteria) this;
        }

        public Criteria andIGoodNotEqualTo(Integer value) {
            addCriterion("i_good <>", value, "iGood");
            return (Criteria) this;
        }

        public Criteria andIGoodGreaterThan(Integer value) {
            addCriterion("i_good >", value, "iGood");
            return (Criteria) this;
        }

        public Criteria andIGoodGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_good >=", value, "iGood");
            return (Criteria) this;
        }

        public Criteria andIGoodLessThan(Integer value) {
            addCriterion("i_good <", value, "iGood");
            return (Criteria) this;
        }

        public Criteria andIGoodLessThanOrEqualTo(Integer value) {
            addCriterion("i_good <=", value, "iGood");
            return (Criteria) this;
        }

        public Criteria andIGoodIn(List<Integer> values) {
            addCriterion("i_good in", values, "iGood");
            return (Criteria) this;
        }

        public Criteria andIGoodNotIn(List<Integer> values) {
            addCriterion("i_good not in", values, "iGood");
            return (Criteria) this;
        }

        public Criteria andIGoodBetween(Integer value1, Integer value2) {
            addCriterion("i_good between", value1, value2, "iGood");
            return (Criteria) this;
        }

        public Criteria andIGoodNotBetween(Integer value1, Integer value2) {
            addCriterion("i_good not between", value1, value2, "iGood");
            return (Criteria) this;
        }

        public Criteria andIGoodchooseIsNull() {
            addCriterion("i_goodchoose is null");
            return (Criteria) this;
        }

        public Criteria andIGoodchooseIsNotNull() {
            addCriterion("i_goodchoose is not null");
            return (Criteria) this;
        }

        public Criteria andIGoodchooseEqualTo(String value) {
            addCriterion("i_goodchoose =", value, "iGoodchoose");
            return (Criteria) this;
        }

        public Criteria andIGoodchooseNotEqualTo(String value) {
            addCriterion("i_goodchoose <>", value, "iGoodchoose");
            return (Criteria) this;
        }

        public Criteria andIGoodchooseGreaterThan(String value) {
            addCriterion("i_goodchoose >", value, "iGoodchoose");
            return (Criteria) this;
        }

        public Criteria andIGoodchooseGreaterThanOrEqualTo(String value) {
            addCriterion("i_goodchoose >=", value, "iGoodchoose");
            return (Criteria) this;
        }

        public Criteria andIGoodchooseLessThan(String value) {
            addCriterion("i_goodchoose <", value, "iGoodchoose");
            return (Criteria) this;
        }

        public Criteria andIGoodchooseLessThanOrEqualTo(String value) {
            addCriterion("i_goodchoose <=", value, "iGoodchoose");
            return (Criteria) this;
        }

        public Criteria andIGoodchooseLike(String value) {
            addCriterion("i_goodchoose like", value, "iGoodchoose");
            return (Criteria) this;
        }

        public Criteria andIGoodchooseNotLike(String value) {
            addCriterion("i_goodchoose not like", value, "iGoodchoose");
            return (Criteria) this;
        }

        public Criteria andIGoodchooseIn(List<String> values) {
            addCriterion("i_goodchoose in", values, "iGoodchoose");
            return (Criteria) this;
        }

        public Criteria andIGoodchooseNotIn(List<String> values) {
            addCriterion("i_goodchoose not in", values, "iGoodchoose");
            return (Criteria) this;
        }

        public Criteria andIGoodchooseBetween(String value1, String value2) {
            addCriterion("i_goodchoose between", value1, value2, "iGoodchoose");
            return (Criteria) this;
        }

        public Criteria andIGoodchooseNotBetween(String value1, String value2) {
            addCriterion("i_goodchoose not between", value1, value2, "iGoodchoose");
            return (Criteria) this;
        }

        public Criteria andIGoodnumIsNull() {
            addCriterion("i_goodnum is null");
            return (Criteria) this;
        }

        public Criteria andIGoodnumIsNotNull() {
            addCriterion("i_goodnum is not null");
            return (Criteria) this;
        }

        public Criteria andIGoodnumEqualTo(Integer value) {
            addCriterion("i_goodnum =", value, "iGoodnum");
            return (Criteria) this;
        }

        public Criteria andIGoodnumNotEqualTo(Integer value) {
            addCriterion("i_goodnum <>", value, "iGoodnum");
            return (Criteria) this;
        }

        public Criteria andIGoodnumGreaterThan(Integer value) {
            addCriterion("i_goodnum >", value, "iGoodnum");
            return (Criteria) this;
        }

        public Criteria andIGoodnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_goodnum >=", value, "iGoodnum");
            return (Criteria) this;
        }

        public Criteria andIGoodnumLessThan(Integer value) {
            addCriterion("i_goodnum <", value, "iGoodnum");
            return (Criteria) this;
        }

        public Criteria andIGoodnumLessThanOrEqualTo(Integer value) {
            addCriterion("i_goodnum <=", value, "iGoodnum");
            return (Criteria) this;
        }

        public Criteria andIGoodnumIn(List<Integer> values) {
            addCriterion("i_goodnum in", values, "iGoodnum");
            return (Criteria) this;
        }

        public Criteria andIGoodnumNotIn(List<Integer> values) {
            addCriterion("i_goodnum not in", values, "iGoodnum");
            return (Criteria) this;
        }

        public Criteria andIGoodnumBetween(Integer value1, Integer value2) {
            addCriterion("i_goodnum between", value1, value2, "iGoodnum");
            return (Criteria) this;
        }

        public Criteria andIGoodnumNotBetween(Integer value1, Integer value2) {
            addCriterion("i_goodnum not between", value1, value2, "iGoodnum");
            return (Criteria) this;
        }

        public Criteria andITakeIsNull() {
            addCriterion("i_take is null");
            return (Criteria) this;
        }

        public Criteria andITakeIsNotNull() {
            addCriterion("i_take is not null");
            return (Criteria) this;
        }

        public Criteria andITakeEqualTo(Double value) {
            addCriterion("i_take =", value, "iTake");
            return (Criteria) this;
        }

        public Criteria andITakeNotEqualTo(Double value) {
            addCriterion("i_take <>", value, "iTake");
            return (Criteria) this;
        }

        public Criteria andITakeGreaterThan(Double value) {
            addCriterion("i_take >", value, "iTake");
            return (Criteria) this;
        }

        public Criteria andITakeGreaterThanOrEqualTo(Double value) {
            addCriterion("i_take >=", value, "iTake");
            return (Criteria) this;
        }

        public Criteria andITakeLessThan(Double value) {
            addCriterion("i_take <", value, "iTake");
            return (Criteria) this;
        }

        public Criteria andITakeLessThanOrEqualTo(Double value) {
            addCriterion("i_take <=", value, "iTake");
            return (Criteria) this;
        }

        public Criteria andITakeIn(List<Double> values) {
            addCriterion("i_take in", values, "iTake");
            return (Criteria) this;
        }

        public Criteria andITakeNotIn(List<Double> values) {
            addCriterion("i_take not in", values, "iTake");
            return (Criteria) this;
        }

        public Criteria andITakeBetween(Double value1, Double value2) {
            addCriterion("i_take between", value1, value2, "iTake");
            return (Criteria) this;
        }

        public Criteria andITakeNotBetween(Double value1, Double value2) {
            addCriterion("i_take not between", value1, value2, "iTake");
            return (Criteria) this;
        }

        public Criteria andIPayaccountIsNull() {
            addCriterion("i_payaccount is null");
            return (Criteria) this;
        }

        public Criteria andIPayaccountIsNotNull() {
            addCriterion("i_payaccount is not null");
            return (Criteria) this;
        }

        public Criteria andIPayaccountEqualTo(Integer value) {
            addCriterion("i_payaccount =", value, "iPayaccount");
            return (Criteria) this;
        }

        public Criteria andIPayaccountNotEqualTo(Integer value) {
            addCriterion("i_payaccount <>", value, "iPayaccount");
            return (Criteria) this;
        }

        public Criteria andIPayaccountGreaterThan(Integer value) {
            addCriterion("i_payaccount >", value, "iPayaccount");
            return (Criteria) this;
        }

        public Criteria andIPayaccountGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_payaccount >=", value, "iPayaccount");
            return (Criteria) this;
        }

        public Criteria andIPayaccountLessThan(Integer value) {
            addCriterion("i_payaccount <", value, "iPayaccount");
            return (Criteria) this;
        }

        public Criteria andIPayaccountLessThanOrEqualTo(Integer value) {
            addCriterion("i_payaccount <=", value, "iPayaccount");
            return (Criteria) this;
        }

        public Criteria andIPayaccountIn(List<Integer> values) {
            addCriterion("i_payaccount in", values, "iPayaccount");
            return (Criteria) this;
        }

        public Criteria andIPayaccountNotIn(List<Integer> values) {
            addCriterion("i_payaccount not in", values, "iPayaccount");
            return (Criteria) this;
        }

        public Criteria andIPayaccountBetween(Integer value1, Integer value2) {
            addCriterion("i_payaccount between", value1, value2, "iPayaccount");
            return (Criteria) this;
        }

        public Criteria andIPayaccountNotBetween(Integer value1, Integer value2) {
            addCriterion("i_payaccount not between", value1, value2, "iPayaccount");
            return (Criteria) this;
        }

        public Criteria andIDateIsNull() {
            addCriterion("i_date is null");
            return (Criteria) this;
        }

        public Criteria andIDateIsNotNull() {
            addCriterion("i_date is not null");
            return (Criteria) this;
        }

        public Criteria andIDateEqualTo(String value) {
            addCriterion("i_date =", value, "iDate");
            return (Criteria) this;
        }

        public Criteria andIDateNotEqualTo(String value) {
            addCriterion("i_date <>", value, "iDate");
            return (Criteria) this;
        }

        public Criteria andIDateGreaterThan(String value) {
            addCriterion("i_date >", value, "iDate");
            return (Criteria) this;
        }

        public Criteria andIDateGreaterThanOrEqualTo(String value) {
            addCriterion("i_date >=", value, "iDate");
            return (Criteria) this;
        }

        public Criteria andIDateLessThan(String value) {
            addCriterion("i_date <", value, "iDate");
            return (Criteria) this;
        }

        public Criteria andIDateLessThanOrEqualTo(String value) {
            addCriterion("i_date <=", value, "iDate");
            return (Criteria) this;
        }

        public Criteria andIDateLike(String value) {
            addCriterion("i_date like", value, "iDate");
            return (Criteria) this;
        }

        public Criteria andIDateNotLike(String value) {
            addCriterion("i_date not like", value, "iDate");
            return (Criteria) this;
        }

        public Criteria andIDateIn(List<String> values) {
            addCriterion("i_date in", values, "iDate");
            return (Criteria) this;
        }

        public Criteria andIDateNotIn(List<String> values) {
            addCriterion("i_date not in", values, "iDate");
            return (Criteria) this;
        }

        public Criteria andIDateBetween(String value1, String value2) {
            addCriterion("i_date between", value1, value2, "iDate");
            return (Criteria) this;
        }

        public Criteria andIDateNotBetween(String value1, String value2) {
            addCriterion("i_date not between", value1, value2, "iDate");
            return (Criteria) this;
        }

        public Criteria andICommentIsNull() {
            addCriterion("i_comment is null");
            return (Criteria) this;
        }

        public Criteria andICommentIsNotNull() {
            addCriterion("i_comment is not null");
            return (Criteria) this;
        }

        public Criteria andICommentEqualTo(String value) {
            addCriterion("i_comment =", value, "iComment");
            return (Criteria) this;
        }

        public Criteria andICommentNotEqualTo(String value) {
            addCriterion("i_comment <>", value, "iComment");
            return (Criteria) this;
        }

        public Criteria andICommentGreaterThan(String value) {
            addCriterion("i_comment >", value, "iComment");
            return (Criteria) this;
        }

        public Criteria andICommentGreaterThanOrEqualTo(String value) {
            addCriterion("i_comment >=", value, "iComment");
            return (Criteria) this;
        }

        public Criteria andICommentLessThan(String value) {
            addCriterion("i_comment <", value, "iComment");
            return (Criteria) this;
        }

        public Criteria andICommentLessThanOrEqualTo(String value) {
            addCriterion("i_comment <=", value, "iComment");
            return (Criteria) this;
        }

        public Criteria andICommentLike(String value) {
            addCriterion("i_comment like", value, "iComment");
            return (Criteria) this;
        }

        public Criteria andICommentNotLike(String value) {
            addCriterion("i_comment not like", value, "iComment");
            return (Criteria) this;
        }

        public Criteria andICommentIn(List<String> values) {
            addCriterion("i_comment in", values, "iComment");
            return (Criteria) this;
        }

        public Criteria andICommentNotIn(List<String> values) {
            addCriterion("i_comment not in", values, "iComment");
            return (Criteria) this;
        }

        public Criteria andICommentBetween(String value1, String value2) {
            addCriterion("i_comment between", value1, value2, "iComment");
            return (Criteria) this;
        }

        public Criteria andICommentNotBetween(String value1, String value2) {
            addCriterion("i_comment not between", value1, value2, "iComment");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table indent
     *
     * @mbggenerated do_not_delete_during_merge Sat Aug 12 21:19:47 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table indent
     *
     * @mbggenerated Sat Aug 12 21:19:47 CST 2017
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}