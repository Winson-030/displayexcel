package com.winson.showexcel.Entity;

import java.util.ArrayList;
import java.util.List;

public class TbSampleDetailLocationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbSampleDetailLocationExample() {
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

        public Criteria andSeaAreaIsNull() {
            addCriterion("sea_area is null");
            return (Criteria) this;
        }

        public Criteria andSeaAreaIsNotNull() {
            addCriterion("sea_area is not null");
            return (Criteria) this;
        }

        public Criteria andSeaAreaEqualTo(String value) {
            addCriterion("sea_area =", value, "seaArea");
            return (Criteria) this;
        }

        public Criteria andSeaAreaNotEqualTo(String value) {
            addCriterion("sea_area <>", value, "seaArea");
            return (Criteria) this;
        }

        public Criteria andSeaAreaGreaterThan(String value) {
            addCriterion("sea_area >", value, "seaArea");
            return (Criteria) this;
        }

        public Criteria andSeaAreaGreaterThanOrEqualTo(String value) {
            addCriterion("sea_area >=", value, "seaArea");
            return (Criteria) this;
        }

        public Criteria andSeaAreaLessThan(String value) {
            addCriterion("sea_area <", value, "seaArea");
            return (Criteria) this;
        }

        public Criteria andSeaAreaLessThanOrEqualTo(String value) {
            addCriterion("sea_area <=", value, "seaArea");
            return (Criteria) this;
        }

        public Criteria andSeaAreaLike(String value) {
            addCriterion("sea_area like", value, "seaArea");
            return (Criteria) this;
        }

        public Criteria andSeaAreaNotLike(String value) {
            addCriterion("sea_area not like", value, "seaArea");
            return (Criteria) this;
        }

        public Criteria andSeaAreaIn(List<String> values) {
            addCriterion("sea_area in", values, "seaArea");
            return (Criteria) this;
        }

        public Criteria andSeaAreaNotIn(List<String> values) {
            addCriterion("sea_area not in", values, "seaArea");
            return (Criteria) this;
        }

        public Criteria andSeaAreaBetween(String value1, String value2) {
            addCriterion("sea_area between", value1, value2, "seaArea");
            return (Criteria) this;
        }

        public Criteria andSeaAreaNotBetween(String value1, String value2) {
            addCriterion("sea_area not between", value1, value2, "seaArea");
            return (Criteria) this;
        }

        public Criteria andLocationAreaIsNull() {
            addCriterion("location_area is null");
            return (Criteria) this;
        }

        public Criteria andLocationAreaIsNotNull() {
            addCriterion("location_area is not null");
            return (Criteria) this;
        }

        public Criteria andLocationAreaEqualTo(String value) {
            addCriterion("location_area =", value, "locationArea");
            return (Criteria) this;
        }

        public Criteria andLocationAreaNotEqualTo(String value) {
            addCriterion("location_area <>", value, "locationArea");
            return (Criteria) this;
        }

        public Criteria andLocationAreaGreaterThan(String value) {
            addCriterion("location_area >", value, "locationArea");
            return (Criteria) this;
        }

        public Criteria andLocationAreaGreaterThanOrEqualTo(String value) {
            addCriterion("location_area >=", value, "locationArea");
            return (Criteria) this;
        }

        public Criteria andLocationAreaLessThan(String value) {
            addCriterion("location_area <", value, "locationArea");
            return (Criteria) this;
        }

        public Criteria andLocationAreaLessThanOrEqualTo(String value) {
            addCriterion("location_area <=", value, "locationArea");
            return (Criteria) this;
        }

        public Criteria andLocationAreaLike(String value) {
            addCriterion("location_area like", value, "locationArea");
            return (Criteria) this;
        }

        public Criteria andLocationAreaNotLike(String value) {
            addCriterion("location_area not like", value, "locationArea");
            return (Criteria) this;
        }

        public Criteria andLocationAreaIn(List<String> values) {
            addCriterion("location_area in", values, "locationArea");
            return (Criteria) this;
        }

        public Criteria andLocationAreaNotIn(List<String> values) {
            addCriterion("location_area not in", values, "locationArea");
            return (Criteria) this;
        }

        public Criteria andLocationAreaBetween(String value1, String value2) {
            addCriterion("location_area between", value1, value2, "locationArea");
            return (Criteria) this;
        }

        public Criteria andLocationAreaNotBetween(String value1, String value2) {
            addCriterion("location_area not between", value1, value2, "locationArea");
            return (Criteria) this;
        }

        public Criteria andCoordinateXIsNull() {
            addCriterion("coordinate_x is null");
            return (Criteria) this;
        }

        public Criteria andCoordinateXIsNotNull() {
            addCriterion("coordinate_x is not null");
            return (Criteria) this;
        }

        public Criteria andCoordinateXEqualTo(Double value) {
            addCriterion("coordinate_x =", value, "coordinateX");
            return (Criteria) this;
        }

        public Criteria andCoordinateXNotEqualTo(Double value) {
            addCriterion("coordinate_x <>", value, "coordinateX");
            return (Criteria) this;
        }

        public Criteria andCoordinateXGreaterThan(Double value) {
            addCriterion("coordinate_x >", value, "coordinateX");
            return (Criteria) this;
        }

        public Criteria andCoordinateXGreaterThanOrEqualTo(Double value) {
            addCriterion("coordinate_x >=", value, "coordinateX");
            return (Criteria) this;
        }

        public Criteria andCoordinateXLessThan(Double value) {
            addCriterion("coordinate_x <", value, "coordinateX");
            return (Criteria) this;
        }

        public Criteria andCoordinateXLessThanOrEqualTo(Double value) {
            addCriterion("coordinate_x <=", value, "coordinateX");
            return (Criteria) this;
        }

        public Criteria andCoordinateXIn(List<Double> values) {
            addCriterion("coordinate_x in", values, "coordinateX");
            return (Criteria) this;
        }

        public Criteria andCoordinateXNotIn(List<Double> values) {
            addCriterion("coordinate_x not in", values, "coordinateX");
            return (Criteria) this;
        }

        public Criteria andCoordinateXBetween(Double value1, Double value2) {
            addCriterion("coordinate_x between", value1, value2, "coordinateX");
            return (Criteria) this;
        }

        public Criteria andCoordinateXNotBetween(Double value1, Double value2) {
            addCriterion("coordinate_x not between", value1, value2, "coordinateX");
            return (Criteria) this;
        }

        public Criteria andCoordinateYIsNull() {
            addCriterion("coordinate_y is null");
            return (Criteria) this;
        }

        public Criteria andCoordinateYIsNotNull() {
            addCriterion("coordinate_y is not null");
            return (Criteria) this;
        }

        public Criteria andCoordinateYEqualTo(Double value) {
            addCriterion("coordinate_y =", value, "coordinateY");
            return (Criteria) this;
        }

        public Criteria andCoordinateYNotEqualTo(Double value) {
            addCriterion("coordinate_y <>", value, "coordinateY");
            return (Criteria) this;
        }

        public Criteria andCoordinateYGreaterThan(Double value) {
            addCriterion("coordinate_y >", value, "coordinateY");
            return (Criteria) this;
        }

        public Criteria andCoordinateYGreaterThanOrEqualTo(Double value) {
            addCriterion("coordinate_y >=", value, "coordinateY");
            return (Criteria) this;
        }

        public Criteria andCoordinateYLessThan(Double value) {
            addCriterion("coordinate_y <", value, "coordinateY");
            return (Criteria) this;
        }

        public Criteria andCoordinateYLessThanOrEqualTo(Double value) {
            addCriterion("coordinate_y <=", value, "coordinateY");
            return (Criteria) this;
        }

        public Criteria andCoordinateYIn(List<Double> values) {
            addCriterion("coordinate_y in", values, "coordinateY");
            return (Criteria) this;
        }

        public Criteria andCoordinateYNotIn(List<Double> values) {
            addCriterion("coordinate_y not in", values, "coordinateY");
            return (Criteria) this;
        }

        public Criteria andCoordinateYBetween(Double value1, Double value2) {
            addCriterion("coordinate_y between", value1, value2, "coordinateY");
            return (Criteria) this;
        }

        public Criteria andCoordinateYNotBetween(Double value1, Double value2) {
            addCriterion("coordinate_y not between", value1, value2, "coordinateY");
            return (Criteria) this;
        }

        public Criteria andDetailAddressIsNull() {
            addCriterion("detail_address is null");
            return (Criteria) this;
        }

        public Criteria andDetailAddressIsNotNull() {
            addCriterion("detail_address is not null");
            return (Criteria) this;
        }

        public Criteria andDetailAddressEqualTo(String value) {
            addCriterion("detail_address =", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressNotEqualTo(String value) {
            addCriterion("detail_address <>", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressGreaterThan(String value) {
            addCriterion("detail_address >", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressGreaterThanOrEqualTo(String value) {
            addCriterion("detail_address >=", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressLessThan(String value) {
            addCriterion("detail_address <", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressLessThanOrEqualTo(String value) {
            addCriterion("detail_address <=", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressLike(String value) {
            addCriterion("detail_address like", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressNotLike(String value) {
            addCriterion("detail_address not like", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressIn(List<String> values) {
            addCriterion("detail_address in", values, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressNotIn(List<String> values) {
            addCriterion("detail_address not in", values, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressBetween(String value1, String value2) {
            addCriterion("detail_address between", value1, value2, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressNotBetween(String value1, String value2) {
            addCriterion("detail_address not between", value1, value2, "detailAddress");
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