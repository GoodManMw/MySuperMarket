package com.mysupermarket.pojo;

import java.util.ArrayList;
import java.util.List;

public class GoodEvaluateExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table good_evaluate
     *
     * @mbggenerated Sun Aug 06 09:44:18 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table good_evaluate
     *
     * @mbggenerated Sun Aug 06 09:44:18 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table good_evaluate
     *
     * @mbggenerated Sun Aug 06 09:44:18 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_evaluate
     *
     * @mbggenerated Sun Aug 06 09:44:18 CST 2017
     */
    public GoodEvaluateExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_evaluate
     *
     * @mbggenerated Sun Aug 06 09:44:18 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_evaluate
     *
     * @mbggenerated Sun Aug 06 09:44:18 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_evaluate
     *
     * @mbggenerated Sun Aug 06 09:44:18 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_evaluate
     *
     * @mbggenerated Sun Aug 06 09:44:18 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_evaluate
     *
     * @mbggenerated Sun Aug 06 09:44:18 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_evaluate
     *
     * @mbggenerated Sun Aug 06 09:44:18 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_evaluate
     *
     * @mbggenerated Sun Aug 06 09:44:18 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_evaluate
     *
     * @mbggenerated Sun Aug 06 09:44:18 CST 2017
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
     * This method corresponds to the database table good_evaluate
     *
     * @mbggenerated Sun Aug 06 09:44:18 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_evaluate
     *
     * @mbggenerated Sun Aug 06 09:44:18 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table good_evaluate
     *
     * @mbggenerated Sun Aug 06 09:44:18 CST 2017
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

        public Criteria andGdlIdIsNull() {
            addCriterion("gdl_id is null");
            return (Criteria) this;
        }

        public Criteria andGdlIdIsNotNull() {
            addCriterion("gdl_id is not null");
            return (Criteria) this;
        }

        public Criteria andGdlIdEqualTo(Integer value) {
            addCriterion("gdl_id =", value, "gdlId");
            return (Criteria) this;
        }

        public Criteria andGdlIdNotEqualTo(Integer value) {
            addCriterion("gdl_id <>", value, "gdlId");
            return (Criteria) this;
        }

        public Criteria andGdlIdGreaterThan(Integer value) {
            addCriterion("gdl_id >", value, "gdlId");
            return (Criteria) this;
        }

        public Criteria andGdlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gdl_id >=", value, "gdlId");
            return (Criteria) this;
        }

        public Criteria andGdlIdLessThan(Integer value) {
            addCriterion("gdl_id <", value, "gdlId");
            return (Criteria) this;
        }

        public Criteria andGdlIdLessThanOrEqualTo(Integer value) {
            addCriterion("gdl_id <=", value, "gdlId");
            return (Criteria) this;
        }

        public Criteria andGdlIdIn(List<Integer> values) {
            addCriterion("gdl_id in", values, "gdlId");
            return (Criteria) this;
        }

        public Criteria andGdlIdNotIn(List<Integer> values) {
            addCriterion("gdl_id not in", values, "gdlId");
            return (Criteria) this;
        }

        public Criteria andGdlIdBetween(Integer value1, Integer value2) {
            addCriterion("gdl_id between", value1, value2, "gdlId");
            return (Criteria) this;
        }

        public Criteria andGdlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gdl_id not between", value1, value2, "gdlId");
            return (Criteria) this;
        }

        public Criteria andGdlDateIsNull() {
            addCriterion("gdl_date is null");
            return (Criteria) this;
        }

        public Criteria andGdlDateIsNotNull() {
            addCriterion("gdl_date is not null");
            return (Criteria) this;
        }

        public Criteria andGdlDateEqualTo(String value) {
            addCriterion("gdl_date =", value, "gdlDate");
            return (Criteria) this;
        }

        public Criteria andGdlDateNotEqualTo(String value) {
            addCriterion("gdl_date <>", value, "gdlDate");
            return (Criteria) this;
        }

        public Criteria andGdlDateGreaterThan(String value) {
            addCriterion("gdl_date >", value, "gdlDate");
            return (Criteria) this;
        }

        public Criteria andGdlDateGreaterThanOrEqualTo(String value) {
            addCriterion("gdl_date >=", value, "gdlDate");
            return (Criteria) this;
        }

        public Criteria andGdlDateLessThan(String value) {
            addCriterion("gdl_date <", value, "gdlDate");
            return (Criteria) this;
        }

        public Criteria andGdlDateLessThanOrEqualTo(String value) {
            addCriterion("gdl_date <=", value, "gdlDate");
            return (Criteria) this;
        }

        public Criteria andGdlDateLike(String value) {
            addCriterion("gdl_date like", value, "gdlDate");
            return (Criteria) this;
        }

        public Criteria andGdlDateNotLike(String value) {
            addCriterion("gdl_date not like", value, "gdlDate");
            return (Criteria) this;
        }

        public Criteria andGdlDateIn(List<String> values) {
            addCriterion("gdl_date in", values, "gdlDate");
            return (Criteria) this;
        }

        public Criteria andGdlDateNotIn(List<String> values) {
            addCriterion("gdl_date not in", values, "gdlDate");
            return (Criteria) this;
        }

        public Criteria andGdlDateBetween(String value1, String value2) {
            addCriterion("gdl_date between", value1, value2, "gdlDate");
            return (Criteria) this;
        }

        public Criteria andGdlDateNotBetween(String value1, String value2) {
            addCriterion("gdl_date not between", value1, value2, "gdlDate");
            return (Criteria) this;
        }

        public Criteria andGdlChoseIsNull() {
            addCriterion("gdl_chose is null");
            return (Criteria) this;
        }

        public Criteria andGdlChoseIsNotNull() {
            addCriterion("gdl_chose is not null");
            return (Criteria) this;
        }

        public Criteria andGdlChoseEqualTo(String value) {
            addCriterion("gdl_chose =", value, "gdlChose");
            return (Criteria) this;
        }

        public Criteria andGdlChoseNotEqualTo(String value) {
            addCriterion("gdl_chose <>", value, "gdlChose");
            return (Criteria) this;
        }

        public Criteria andGdlChoseGreaterThan(String value) {
            addCriterion("gdl_chose >", value, "gdlChose");
            return (Criteria) this;
        }

        public Criteria andGdlChoseGreaterThanOrEqualTo(String value) {
            addCriterion("gdl_chose >=", value, "gdlChose");
            return (Criteria) this;
        }

        public Criteria andGdlChoseLessThan(String value) {
            addCriterion("gdl_chose <", value, "gdlChose");
            return (Criteria) this;
        }

        public Criteria andGdlChoseLessThanOrEqualTo(String value) {
            addCriterion("gdl_chose <=", value, "gdlChose");
            return (Criteria) this;
        }

        public Criteria andGdlChoseLike(String value) {
            addCriterion("gdl_chose like", value, "gdlChose");
            return (Criteria) this;
        }

        public Criteria andGdlChoseNotLike(String value) {
            addCriterion("gdl_chose not like", value, "gdlChose");
            return (Criteria) this;
        }

        public Criteria andGdlChoseIn(List<String> values) {
            addCriterion("gdl_chose in", values, "gdlChose");
            return (Criteria) this;
        }

        public Criteria andGdlChoseNotIn(List<String> values) {
            addCriterion("gdl_chose not in", values, "gdlChose");
            return (Criteria) this;
        }

        public Criteria andGdlChoseBetween(String value1, String value2) {
            addCriterion("gdl_chose between", value1, value2, "gdlChose");
            return (Criteria) this;
        }

        public Criteria andGdlChoseNotBetween(String value1, String value2) {
            addCriterion("gdl_chose not between", value1, value2, "gdlChose");
            return (Criteria) this;
        }

        public Criteria andGdlContentIsNull() {
            addCriterion("gdl_content is null");
            return (Criteria) this;
        }

        public Criteria andGdlContentIsNotNull() {
            addCriterion("gdl_content is not null");
            return (Criteria) this;
        }

        public Criteria andGdlContentEqualTo(String value) {
            addCriterion("gdl_content =", value, "gdlContent");
            return (Criteria) this;
        }

        public Criteria andGdlContentNotEqualTo(String value) {
            addCriterion("gdl_content <>", value, "gdlContent");
            return (Criteria) this;
        }

        public Criteria andGdlContentGreaterThan(String value) {
            addCriterion("gdl_content >", value, "gdlContent");
            return (Criteria) this;
        }

        public Criteria andGdlContentGreaterThanOrEqualTo(String value) {
            addCriterion("gdl_content >=", value, "gdlContent");
            return (Criteria) this;
        }

        public Criteria andGdlContentLessThan(String value) {
            addCriterion("gdl_content <", value, "gdlContent");
            return (Criteria) this;
        }

        public Criteria andGdlContentLessThanOrEqualTo(String value) {
            addCriterion("gdl_content <=", value, "gdlContent");
            return (Criteria) this;
        }

        public Criteria andGdlContentLike(String value) {
            addCriterion("gdl_content like", value, "gdlContent");
            return (Criteria) this;
        }

        public Criteria andGdlContentNotLike(String value) {
            addCriterion("gdl_content not like", value, "gdlContent");
            return (Criteria) this;
        }

        public Criteria andGdlContentIn(List<String> values) {
            addCriterion("gdl_content in", values, "gdlContent");
            return (Criteria) this;
        }

        public Criteria andGdlContentNotIn(List<String> values) {
            addCriterion("gdl_content not in", values, "gdlContent");
            return (Criteria) this;
        }

        public Criteria andGdlContentBetween(String value1, String value2) {
            addCriterion("gdl_content between", value1, value2, "gdlContent");
            return (Criteria) this;
        }

        public Criteria andGdlContentNotBetween(String value1, String value2) {
            addCriterion("gdl_content not between", value1, value2, "gdlContent");
            return (Criteria) this;
        }

        public Criteria andGdlGoodIsNull() {
            addCriterion("gdl_good is null");
            return (Criteria) this;
        }

        public Criteria andGdlGoodIsNotNull() {
            addCriterion("gdl_good is not null");
            return (Criteria) this;
        }

        public Criteria andGdlGoodEqualTo(Integer value) {
            addCriterion("gdl_good =", value, "gdlGood");
            return (Criteria) this;
        }

        public Criteria andGdlGoodNotEqualTo(Integer value) {
            addCriterion("gdl_good <>", value, "gdlGood");
            return (Criteria) this;
        }

        public Criteria andGdlGoodGreaterThan(Integer value) {
            addCriterion("gdl_good >", value, "gdlGood");
            return (Criteria) this;
        }

        public Criteria andGdlGoodGreaterThanOrEqualTo(Integer value) {
            addCriterion("gdl_good >=", value, "gdlGood");
            return (Criteria) this;
        }

        public Criteria andGdlGoodLessThan(Integer value) {
            addCriterion("gdl_good <", value, "gdlGood");
            return (Criteria) this;
        }

        public Criteria andGdlGoodLessThanOrEqualTo(Integer value) {
            addCriterion("gdl_good <=", value, "gdlGood");
            return (Criteria) this;
        }

        public Criteria andGdlGoodIn(List<Integer> values) {
            addCriterion("gdl_good in", values, "gdlGood");
            return (Criteria) this;
        }

        public Criteria andGdlGoodNotIn(List<Integer> values) {
            addCriterion("gdl_good not in", values, "gdlGood");
            return (Criteria) this;
        }

        public Criteria andGdlGoodBetween(Integer value1, Integer value2) {
            addCriterion("gdl_good between", value1, value2, "gdlGood");
            return (Criteria) this;
        }

        public Criteria andGdlGoodNotBetween(Integer value1, Integer value2) {
            addCriterion("gdl_good not between", value1, value2, "gdlGood");
            return (Criteria) this;
        }

        public Criteria andGdlUseraccountIsNull() {
            addCriterion("gdl_useraccount is null");
            return (Criteria) this;
        }

        public Criteria andGdlUseraccountIsNotNull() {
            addCriterion("gdl_useraccount is not null");
            return (Criteria) this;
        }

        public Criteria andGdlUseraccountEqualTo(Integer value) {
            addCriterion("gdl_useraccount =", value, "gdlUseraccount");
            return (Criteria) this;
        }

        public Criteria andGdlUseraccountNotEqualTo(Integer value) {
            addCriterion("gdl_useraccount <>", value, "gdlUseraccount");
            return (Criteria) this;
        }

        public Criteria andGdlUseraccountGreaterThan(Integer value) {
            addCriterion("gdl_useraccount >", value, "gdlUseraccount");
            return (Criteria) this;
        }

        public Criteria andGdlUseraccountGreaterThanOrEqualTo(Integer value) {
            addCriterion("gdl_useraccount >=", value, "gdlUseraccount");
            return (Criteria) this;
        }

        public Criteria andGdlUseraccountLessThan(Integer value) {
            addCriterion("gdl_useraccount <", value, "gdlUseraccount");
            return (Criteria) this;
        }

        public Criteria andGdlUseraccountLessThanOrEqualTo(Integer value) {
            addCriterion("gdl_useraccount <=", value, "gdlUseraccount");
            return (Criteria) this;
        }

        public Criteria andGdlUseraccountIn(List<Integer> values) {
            addCriterion("gdl_useraccount in", values, "gdlUseraccount");
            return (Criteria) this;
        }

        public Criteria andGdlUseraccountNotIn(List<Integer> values) {
            addCriterion("gdl_useraccount not in", values, "gdlUseraccount");
            return (Criteria) this;
        }

        public Criteria andGdlUseraccountBetween(Integer value1, Integer value2) {
            addCriterion("gdl_useraccount between", value1, value2, "gdlUseraccount");
            return (Criteria) this;
        }

        public Criteria andGdlUseraccountNotBetween(Integer value1, Integer value2) {
            addCriterion("gdl_useraccount not between", value1, value2, "gdlUseraccount");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table good_evaluate
     *
     * @mbggenerated do_not_delete_during_merge Sun Aug 06 09:44:18 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table good_evaluate
     *
     * @mbggenerated Sun Aug 06 09:44:18 CST 2017
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