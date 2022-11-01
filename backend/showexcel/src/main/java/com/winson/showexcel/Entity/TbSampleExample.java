package com.winson.showexcel.Entity;

import java.util.ArrayList;
import java.util.List;

public class TbSampleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbSampleExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNoIsNull() {
            addCriterion("`no` is null");
            return (Criteria) this;
        }

        public Criteria andNoIsNotNull() {
            addCriterion("`no` is not null");
            return (Criteria) this;
        }

        public Criteria andNoEqualTo(Integer value) {
            addCriterion("`no` =", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotEqualTo(Integer value) {
            addCriterion("`no` <>", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThan(Integer value) {
            addCriterion("`no` >", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("`no` >=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThan(Integer value) {
            addCriterion("`no` <", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThanOrEqualTo(Integer value) {
            addCriterion("`no` <=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoIn(List<Integer> values) {
            addCriterion("`no` in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotIn(List<Integer> values) {
            addCriterion("`no` not in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoBetween(Integer value1, Integer value2) {
            addCriterion("`no` between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotBetween(Integer value1, Integer value2) {
            addCriterion("`no` not between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andSampleIdIsNull() {
            addCriterion("sample_id is null");
            return (Criteria) this;
        }

        public Criteria andSampleIdIsNotNull() {
            addCriterion("sample_id is not null");
            return (Criteria) this;
        }

        public Criteria andSampleIdEqualTo(String value) {
            addCriterion("sample_id =", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdNotEqualTo(String value) {
            addCriterion("sample_id <>", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdGreaterThan(String value) {
            addCriterion("sample_id >", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdGreaterThanOrEqualTo(String value) {
            addCriterion("sample_id >=", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdLessThan(String value) {
            addCriterion("sample_id <", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdLessThanOrEqualTo(String value) {
            addCriterion("sample_id <=", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdLike(String value) {
            addCriterion("sample_id like", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdNotLike(String value) {
            addCriterion("sample_id not like", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdIn(List<String> values) {
            addCriterion("sample_id in", values, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdNotIn(List<String> values) {
            addCriterion("sample_id not in", values, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdBetween(String value1, String value2) {
            addCriterion("sample_id between", value1, value2, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdNotBetween(String value1, String value2) {
            addCriterion("sample_id not between", value1, value2, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSurveyShipIsNull() {
            addCriterion("survey_ship is null");
            return (Criteria) this;
        }

        public Criteria andSurveyShipIsNotNull() {
            addCriterion("survey_ship is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyShipEqualTo(String value) {
            addCriterion("survey_ship =", value, "surveyShip");
            return (Criteria) this;
        }

        public Criteria andSurveyShipNotEqualTo(String value) {
            addCriterion("survey_ship <>", value, "surveyShip");
            return (Criteria) this;
        }

        public Criteria andSurveyShipGreaterThan(String value) {
            addCriterion("survey_ship >", value, "surveyShip");
            return (Criteria) this;
        }

        public Criteria andSurveyShipGreaterThanOrEqualTo(String value) {
            addCriterion("survey_ship >=", value, "surveyShip");
            return (Criteria) this;
        }

        public Criteria andSurveyShipLessThan(String value) {
            addCriterion("survey_ship <", value, "surveyShip");
            return (Criteria) this;
        }

        public Criteria andSurveyShipLessThanOrEqualTo(String value) {
            addCriterion("survey_ship <=", value, "surveyShip");
            return (Criteria) this;
        }

        public Criteria andSurveyShipLike(String value) {
            addCriterion("survey_ship like", value, "surveyShip");
            return (Criteria) this;
        }

        public Criteria andSurveyShipNotLike(String value) {
            addCriterion("survey_ship not like", value, "surveyShip");
            return (Criteria) this;
        }

        public Criteria andSurveyShipIn(List<String> values) {
            addCriterion("survey_ship in", values, "surveyShip");
            return (Criteria) this;
        }

        public Criteria andSurveyShipNotIn(List<String> values) {
            addCriterion("survey_ship not in", values, "surveyShip");
            return (Criteria) this;
        }

        public Criteria andSurveyShipBetween(String value1, String value2) {
            addCriterion("survey_ship between", value1, value2, "surveyShip");
            return (Criteria) this;
        }

        public Criteria andSurveyShipNotBetween(String value1, String value2) {
            addCriterion("survey_ship not between", value1, value2, "surveyShip");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberIsNull() {
            addCriterion("voyage_number is null");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberIsNotNull() {
            addCriterion("voyage_number is not null");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberEqualTo(String value) {
            addCriterion("voyage_number =", value, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberNotEqualTo(String value) {
            addCriterion("voyage_number <>", value, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberGreaterThan(String value) {
            addCriterion("voyage_number >", value, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberGreaterThanOrEqualTo(String value) {
            addCriterion("voyage_number >=", value, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberLessThan(String value) {
            addCriterion("voyage_number <", value, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberLessThanOrEqualTo(String value) {
            addCriterion("voyage_number <=", value, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberLike(String value) {
            addCriterion("voyage_number like", value, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberNotLike(String value) {
            addCriterion("voyage_number not like", value, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberIn(List<String> values) {
            addCriterion("voyage_number in", values, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberNotIn(List<String> values) {
            addCriterion("voyage_number not in", values, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberBetween(String value1, String value2) {
            addCriterion("voyage_number between", value1, value2, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberNotBetween(String value1, String value2) {
            addCriterion("voyage_number not between", value1, value2, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andEndDepthIsNull() {
            addCriterion("end_depth is null");
            return (Criteria) this;
        }

        public Criteria andEndDepthIsNotNull() {
            addCriterion("end_depth is not null");
            return (Criteria) this;
        }

        public Criteria andEndDepthEqualTo(Double value) {
            addCriterion("end_depth =", value, "endDepth");
            return (Criteria) this;
        }

        public Criteria andEndDepthNotEqualTo(Double value) {
            addCriterion("end_depth <>", value, "endDepth");
            return (Criteria) this;
        }

        public Criteria andEndDepthGreaterThan(Double value) {
            addCriterion("end_depth >", value, "endDepth");
            return (Criteria) this;
        }

        public Criteria andEndDepthGreaterThanOrEqualTo(Double value) {
            addCriterion("end_depth >=", value, "endDepth");
            return (Criteria) this;
        }

        public Criteria andEndDepthLessThan(Double value) {
            addCriterion("end_depth <", value, "endDepth");
            return (Criteria) this;
        }

        public Criteria andEndDepthLessThanOrEqualTo(Double value) {
            addCriterion("end_depth <=", value, "endDepth");
            return (Criteria) this;
        }

        public Criteria andEndDepthIn(List<Double> values) {
            addCriterion("end_depth in", values, "endDepth");
            return (Criteria) this;
        }

        public Criteria andEndDepthNotIn(List<Double> values) {
            addCriterion("end_depth not in", values, "endDepth");
            return (Criteria) this;
        }

        public Criteria andEndDepthBetween(Double value1, Double value2) {
            addCriterion("end_depth between", value1, value2, "endDepth");
            return (Criteria) this;
        }

        public Criteria andEndDepthNotBetween(Double value1, Double value2) {
            addCriterion("end_depth not between", value1, value2, "endDepth");
            return (Criteria) this;
        }

        public Criteria andDrillerLengthIsNull() {
            addCriterion("driller_length is null");
            return (Criteria) this;
        }

        public Criteria andDrillerLengthIsNotNull() {
            addCriterion("driller_length is not null");
            return (Criteria) this;
        }

        public Criteria andDrillerLengthEqualTo(Double value) {
            addCriterion("driller_length =", value, "drillerLength");
            return (Criteria) this;
        }

        public Criteria andDrillerLengthNotEqualTo(Double value) {
            addCriterion("driller_length <>", value, "drillerLength");
            return (Criteria) this;
        }

        public Criteria andDrillerLengthGreaterThan(Double value) {
            addCriterion("driller_length >", value, "drillerLength");
            return (Criteria) this;
        }

        public Criteria andDrillerLengthGreaterThanOrEqualTo(Double value) {
            addCriterion("driller_length >=", value, "drillerLength");
            return (Criteria) this;
        }

        public Criteria andDrillerLengthLessThan(Double value) {
            addCriterion("driller_length <", value, "drillerLength");
            return (Criteria) this;
        }

        public Criteria andDrillerLengthLessThanOrEqualTo(Double value) {
            addCriterion("driller_length <=", value, "drillerLength");
            return (Criteria) this;
        }

        public Criteria andDrillerLengthIn(List<Double> values) {
            addCriterion("driller_length in", values, "drillerLength");
            return (Criteria) this;
        }

        public Criteria andDrillerLengthNotIn(List<Double> values) {
            addCriterion("driller_length not in", values, "drillerLength");
            return (Criteria) this;
        }

        public Criteria andDrillerLengthBetween(Double value1, Double value2) {
            addCriterion("driller_length between", value1, value2, "drillerLength");
            return (Criteria) this;
        }

        public Criteria andDrillerLengthNotBetween(Double value1, Double value2) {
            addCriterion("driller_length not between", value1, value2, "drillerLength");
            return (Criteria) this;
        }

        public Criteria andStorageLocationIsNull() {
            addCriterion("storage_location is null");
            return (Criteria) this;
        }

        public Criteria andStorageLocationIsNotNull() {
            addCriterion("storage_location is not null");
            return (Criteria) this;
        }

        public Criteria andStorageLocationEqualTo(String value) {
            addCriterion("storage_location =", value, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNotEqualTo(String value) {
            addCriterion("storage_location <>", value, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationGreaterThan(String value) {
            addCriterion("storage_location >", value, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationGreaterThanOrEqualTo(String value) {
            addCriterion("storage_location >=", value, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationLessThan(String value) {
            addCriterion("storage_location <", value, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationLessThanOrEqualTo(String value) {
            addCriterion("storage_location <=", value, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationLike(String value) {
            addCriterion("storage_location like", value, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNotLike(String value) {
            addCriterion("storage_location not like", value, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationIn(List<String> values) {
            addCriterion("storage_location in", values, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNotIn(List<String> values) {
            addCriterion("storage_location not in", values, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationBetween(String value1, String value2) {
            addCriterion("storage_location between", value1, value2, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageLocationNotBetween(String value1, String value2) {
            addCriterion("storage_location not between", value1, value2, "storageLocation");
            return (Criteria) this;
        }

        public Criteria andStorageConditionIsNull() {
            addCriterion("storage_condition is null");
            return (Criteria) this;
        }

        public Criteria andStorageConditionIsNotNull() {
            addCriterion("storage_condition is not null");
            return (Criteria) this;
        }

        public Criteria andStorageConditionEqualTo(Double value) {
            addCriterion("storage_condition =", value, "storageCondition");
            return (Criteria) this;
        }

        public Criteria andStorageConditionNotEqualTo(Double value) {
            addCriterion("storage_condition <>", value, "storageCondition");
            return (Criteria) this;
        }

        public Criteria andStorageConditionGreaterThan(Double value) {
            addCriterion("storage_condition >", value, "storageCondition");
            return (Criteria) this;
        }

        public Criteria andStorageConditionGreaterThanOrEqualTo(Double value) {
            addCriterion("storage_condition >=", value, "storageCondition");
            return (Criteria) this;
        }

        public Criteria andStorageConditionLessThan(Double value) {
            addCriterion("storage_condition <", value, "storageCondition");
            return (Criteria) this;
        }

        public Criteria andStorageConditionLessThanOrEqualTo(Double value) {
            addCriterion("storage_condition <=", value, "storageCondition");
            return (Criteria) this;
        }

        public Criteria andStorageConditionIn(List<Double> values) {
            addCriterion("storage_condition in", values, "storageCondition");
            return (Criteria) this;
        }

        public Criteria andStorageConditionNotIn(List<Double> values) {
            addCriterion("storage_condition not in", values, "storageCondition");
            return (Criteria) this;
        }

        public Criteria andStorageConditionBetween(Double value1, Double value2) {
            addCriterion("storage_condition between", value1, value2, "storageCondition");
            return (Criteria) this;
        }

        public Criteria andStorageConditionNotBetween(Double value1, Double value2) {
            addCriterion("storage_condition not between", value1, value2, "storageCondition");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

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