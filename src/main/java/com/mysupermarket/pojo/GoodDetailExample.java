package com.mysupermarket.pojo;

import java.util.ArrayList;
import java.util.List;

public class GoodDetailExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table good_detail
     *
     * @mbggenerated Sun Aug 06 09:44:18 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table good_detail
     *
     * @mbggenerated Sun Aug 06 09:44:18 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table good_detail
     *
     * @mbggenerated Sun Aug 06 09:44:18 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_detail
     *
     * @mbggenerated Sun Aug 06 09:44:18 CST 2017
     */
    public GoodDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_detail
     *
     * @mbggenerated Sun Aug 06 09:44:18 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_detail
     *
     * @mbggenerated Sun Aug 06 09:44:18 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_detail
     *
     * @mbggenerated Sun Aug 06 09:44:18 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_detail
     *
     * @mbggenerated Sun Aug 06 09:44:18 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_detail
     *
     * @mbggenerated Sun Aug 06 09:44:18 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_detail
     *
     * @mbggenerated Sun Aug 06 09:44:18 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_detail
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
     * This method corresponds to the database table good_detail
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
     * This method corresponds to the database table good_detail
     *
     * @mbggenerated Sun Aug 06 09:44:18 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table good_detail
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
     * This class corresponds to the database table good_detail
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

        public Criteria andGdIdIsNull() {
            addCriterion("gd_id is null");
            return (Criteria) this;
        }

        public Criteria andGdIdIsNotNull() {
            addCriterion("gd_id is not null");
            return (Criteria) this;
        }

        public Criteria andGdIdEqualTo(Integer value) {
            addCriterion("gd_id =", value, "gdId");
            return (Criteria) this;
        }

        public Criteria andGdIdNotEqualTo(Integer value) {
            addCriterion("gd_id <>", value, "gdId");
            return (Criteria) this;
        }

        public Criteria andGdIdGreaterThan(Integer value) {
            addCriterion("gd_id >", value, "gdId");
            return (Criteria) this;
        }

        public Criteria andGdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gd_id >=", value, "gdId");
            return (Criteria) this;
        }

        public Criteria andGdIdLessThan(Integer value) {
            addCriterion("gd_id <", value, "gdId");
            return (Criteria) this;
        }

        public Criteria andGdIdLessThanOrEqualTo(Integer value) {
            addCriterion("gd_id <=", value, "gdId");
            return (Criteria) this;
        }

        public Criteria andGdIdIn(List<Integer> values) {
            addCriterion("gd_id in", values, "gdId");
            return (Criteria) this;
        }

        public Criteria andGdIdNotIn(List<Integer> values) {
            addCriterion("gd_id not in", values, "gdId");
            return (Criteria) this;
        }

        public Criteria andGdIdBetween(Integer value1, Integer value2) {
            addCriterion("gd_id between", value1, value2, "gdId");
            return (Criteria) this;
        }

        public Criteria andGdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gd_id not between", value1, value2, "gdId");
            return (Criteria) this;
        }

        public Criteria andGdUrlIsNull() {
            addCriterion("gd_url is null");
            return (Criteria) this;
        }

        public Criteria andGdUrlIsNotNull() {
            addCriterion("gd_url is not null");
            return (Criteria) this;
        }

        public Criteria andGdUrlEqualTo(String value) {
            addCriterion("gd_url =", value, "gdUrl");
            return (Criteria) this;
        }

        public Criteria andGdUrlNotEqualTo(String value) {
            addCriterion("gd_url <>", value, "gdUrl");
            return (Criteria) this;
        }

        public Criteria andGdUrlGreaterThan(String value) {
            addCriterion("gd_url >", value, "gdUrl");
            return (Criteria) this;
        }

        public Criteria andGdUrlGreaterThanOrEqualTo(String value) {
            addCriterion("gd_url >=", value, "gdUrl");
            return (Criteria) this;
        }

        public Criteria andGdUrlLessThan(String value) {
            addCriterion("gd_url <", value, "gdUrl");
            return (Criteria) this;
        }

        public Criteria andGdUrlLessThanOrEqualTo(String value) {
            addCriterion("gd_url <=", value, "gdUrl");
            return (Criteria) this;
        }

        public Criteria andGdUrlLike(String value) {
            addCriterion("gd_url like", value, "gdUrl");
            return (Criteria) this;
        }

        public Criteria andGdUrlNotLike(String value) {
            addCriterion("gd_url not like", value, "gdUrl");
            return (Criteria) this;
        }

        public Criteria andGdUrlIn(List<String> values) {
            addCriterion("gd_url in", values, "gdUrl");
            return (Criteria) this;
        }

        public Criteria andGdUrlNotIn(List<String> values) {
            addCriterion("gd_url not in", values, "gdUrl");
            return (Criteria) this;
        }

        public Criteria andGdUrlBetween(String value1, String value2) {
            addCriterion("gd_url between", value1, value2, "gdUrl");
            return (Criteria) this;
        }

        public Criteria andGdUrlNotBetween(String value1, String value2) {
            addCriterion("gd_url not between", value1, value2, "gdUrl");
            return (Criteria) this;
        }

        public Criteria andGdPrimepriceIsNull() {
            addCriterion("gd_primeprice is null");
            return (Criteria) this;
        }

        public Criteria andGdPrimepriceIsNotNull() {
            addCriterion("gd_primeprice is not null");
            return (Criteria) this;
        }

        public Criteria andGdPrimepriceEqualTo(Double value) {
            addCriterion("gd_primeprice =", value, "gdPrimeprice");
            return (Criteria) this;
        }

        public Criteria andGdPrimepriceNotEqualTo(Double value) {
            addCriterion("gd_primeprice <>", value, "gdPrimeprice");
            return (Criteria) this;
        }

        public Criteria andGdPrimepriceGreaterThan(Double value) {
            addCriterion("gd_primeprice >", value, "gdPrimeprice");
            return (Criteria) this;
        }

        public Criteria andGdPrimepriceGreaterThanOrEqualTo(Double value) {
            addCriterion("gd_primeprice >=", value, "gdPrimeprice");
            return (Criteria) this;
        }

        public Criteria andGdPrimepriceLessThan(Double value) {
            addCriterion("gd_primeprice <", value, "gdPrimeprice");
            return (Criteria) this;
        }

        public Criteria andGdPrimepriceLessThanOrEqualTo(Double value) {
            addCriterion("gd_primeprice <=", value, "gdPrimeprice");
            return (Criteria) this;
        }

        public Criteria andGdPrimepriceIn(List<Double> values) {
            addCriterion("gd_primeprice in", values, "gdPrimeprice");
            return (Criteria) this;
        }

        public Criteria andGdPrimepriceNotIn(List<Double> values) {
            addCriterion("gd_primeprice not in", values, "gdPrimeprice");
            return (Criteria) this;
        }

        public Criteria andGdPrimepriceBetween(Double value1, Double value2) {
            addCriterion("gd_primeprice between", value1, value2, "gdPrimeprice");
            return (Criteria) this;
        }

        public Criteria andGdPrimepriceNotBetween(Double value1, Double value2) {
            addCriterion("gd_primeprice not between", value1, value2, "gdPrimeprice");
            return (Criteria) this;
        }

        public Criteria andGdFreightIsNull() {
            addCriterion("gd_freight is null");
            return (Criteria) this;
        }

        public Criteria andGdFreightIsNotNull() {
            addCriterion("gd_freight is not null");
            return (Criteria) this;
        }

        public Criteria andGdFreightEqualTo(Double value) {
            addCriterion("gd_freight =", value, "gdFreight");
            return (Criteria) this;
        }

        public Criteria andGdFreightNotEqualTo(Double value) {
            addCriterion("gd_freight <>", value, "gdFreight");
            return (Criteria) this;
        }

        public Criteria andGdFreightGreaterThan(Double value) {
            addCriterion("gd_freight >", value, "gdFreight");
            return (Criteria) this;
        }

        public Criteria andGdFreightGreaterThanOrEqualTo(Double value) {
            addCriterion("gd_freight >=", value, "gdFreight");
            return (Criteria) this;
        }

        public Criteria andGdFreightLessThan(Double value) {
            addCriterion("gd_freight <", value, "gdFreight");
            return (Criteria) this;
        }

        public Criteria andGdFreightLessThanOrEqualTo(Double value) {
            addCriterion("gd_freight <=", value, "gdFreight");
            return (Criteria) this;
        }

        public Criteria andGdFreightIn(List<Double> values) {
            addCriterion("gd_freight in", values, "gdFreight");
            return (Criteria) this;
        }

        public Criteria andGdFreightNotIn(List<Double> values) {
            addCriterion("gd_freight not in", values, "gdFreight");
            return (Criteria) this;
        }

        public Criteria andGdFreightBetween(Double value1, Double value2) {
            addCriterion("gd_freight between", value1, value2, "gdFreight");
            return (Criteria) this;
        }

        public Criteria andGdFreightNotBetween(Double value1, Double value2) {
            addCriterion("gd_freight not between", value1, value2, "gdFreight");
            return (Criteria) this;
        }

        public Criteria andGdChooseIsNull() {
            addCriterion("gd_choose is null");
            return (Criteria) this;
        }

        public Criteria andGdChooseIsNotNull() {
            addCriterion("gd_choose is not null");
            return (Criteria) this;
        }

        public Criteria andGdChooseEqualTo(String value) {
            addCriterion("gd_choose =", value, "gdChoose");
            return (Criteria) this;
        }

        public Criteria andGdChooseNotEqualTo(String value) {
            addCriterion("gd_choose <>", value, "gdChoose");
            return (Criteria) this;
        }

        public Criteria andGdChooseGreaterThan(String value) {
            addCriterion("gd_choose >", value, "gdChoose");
            return (Criteria) this;
        }

        public Criteria andGdChooseGreaterThanOrEqualTo(String value) {
            addCriterion("gd_choose >=", value, "gdChoose");
            return (Criteria) this;
        }

        public Criteria andGdChooseLessThan(String value) {
            addCriterion("gd_choose <", value, "gdChoose");
            return (Criteria) this;
        }

        public Criteria andGdChooseLessThanOrEqualTo(String value) {
            addCriterion("gd_choose <=", value, "gdChoose");
            return (Criteria) this;
        }

        public Criteria andGdChooseLike(String value) {
            addCriterion("gd_choose like", value, "gdChoose");
            return (Criteria) this;
        }

        public Criteria andGdChooseNotLike(String value) {
            addCriterion("gd_choose not like", value, "gdChoose");
            return (Criteria) this;
        }

        public Criteria andGdChooseIn(List<String> values) {
            addCriterion("gd_choose in", values, "gdChoose");
            return (Criteria) this;
        }

        public Criteria andGdChooseNotIn(List<String> values) {
            addCriterion("gd_choose not in", values, "gdChoose");
            return (Criteria) this;
        }

        public Criteria andGdChooseBetween(String value1, String value2) {
            addCriterion("gd_choose between", value1, value2, "gdChoose");
            return (Criteria) this;
        }

        public Criteria andGdChooseNotBetween(String value1, String value2) {
            addCriterion("gd_choose not between", value1, value2, "gdChoose");
            return (Criteria) this;
        }

        public Criteria andGdShopIsNull() {
            addCriterion("gd_shop is null");
            return (Criteria) this;
        }

        public Criteria andGdShopIsNotNull() {
            addCriterion("gd_shop is not null");
            return (Criteria) this;
        }

        public Criteria andGdShopEqualTo(Integer value) {
            addCriterion("gd_shop =", value, "gdShop");
            return (Criteria) this;
        }

        public Criteria andGdShopNotEqualTo(Integer value) {
            addCriterion("gd_shop <>", value, "gdShop");
            return (Criteria) this;
        }

        public Criteria andGdShopGreaterThan(Integer value) {
            addCriterion("gd_shop >", value, "gdShop");
            return (Criteria) this;
        }

        public Criteria andGdShopGreaterThanOrEqualTo(Integer value) {
            addCriterion("gd_shop >=", value, "gdShop");
            return (Criteria) this;
        }

        public Criteria andGdShopLessThan(Integer value) {
            addCriterion("gd_shop <", value, "gdShop");
            return (Criteria) this;
        }

        public Criteria andGdShopLessThanOrEqualTo(Integer value) {
            addCriterion("gd_shop <=", value, "gdShop");
            return (Criteria) this;
        }

        public Criteria andGdShopIn(List<Integer> values) {
            addCriterion("gd_shop in", values, "gdShop");
            return (Criteria) this;
        }

        public Criteria andGdShopNotIn(List<Integer> values) {
            addCriterion("gd_shop not in", values, "gdShop");
            return (Criteria) this;
        }

        public Criteria andGdShopBetween(Integer value1, Integer value2) {
            addCriterion("gd_shop between", value1, value2, "gdShop");
            return (Criteria) this;
        }

        public Criteria andGdShopNotBetween(Integer value1, Integer value2) {
            addCriterion("gd_shop not between", value1, value2, "gdShop");
            return (Criteria) this;
        }

        public Criteria andGdGoodIsNull() {
            addCriterion("gd_good is null");
            return (Criteria) this;
        }

        public Criteria andGdGoodIsNotNull() {
            addCriterion("gd_good is not null");
            return (Criteria) this;
        }

        public Criteria andGdGoodEqualTo(Integer value) {
            addCriterion("gd_good =", value, "gdGood");
            return (Criteria) this;
        }

        public Criteria andGdGoodNotEqualTo(Integer value) {
            addCriterion("gd_good <>", value, "gdGood");
            return (Criteria) this;
        }

        public Criteria andGdGoodGreaterThan(Integer value) {
            addCriterion("gd_good >", value, "gdGood");
            return (Criteria) this;
        }

        public Criteria andGdGoodGreaterThanOrEqualTo(Integer value) {
            addCriterion("gd_good >=", value, "gdGood");
            return (Criteria) this;
        }

        public Criteria andGdGoodLessThan(Integer value) {
            addCriterion("gd_good <", value, "gdGood");
            return (Criteria) this;
        }

        public Criteria andGdGoodLessThanOrEqualTo(Integer value) {
            addCriterion("gd_good <=", value, "gdGood");
            return (Criteria) this;
        }

        public Criteria andGdGoodIn(List<Integer> values) {
            addCriterion("gd_good in", values, "gdGood");
            return (Criteria) this;
        }

        public Criteria andGdGoodNotIn(List<Integer> values) {
            addCriterion("gd_good not in", values, "gdGood");
            return (Criteria) this;
        }

        public Criteria andGdGoodBetween(Integer value1, Integer value2) {
            addCriterion("gd_good between", value1, value2, "gdGood");
            return (Criteria) this;
        }

        public Criteria andGdGoodNotBetween(Integer value1, Integer value2) {
            addCriterion("gd_good not between", value1, value2, "gdGood");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table good_detail
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
     * This class corresponds to the database table good_detail
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