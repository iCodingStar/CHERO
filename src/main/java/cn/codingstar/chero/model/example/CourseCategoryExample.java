package cn.codingstar.chero.model.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseCategoryExample() {
        oredCriteria = new ArrayList<Criteria>();
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryIdIsNull() {
            addCriterion("course_category_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryIdIsNotNull() {
            addCriterion("course_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryIdEqualTo(String value) {
            addCriterion("course_category_id =", value, "courseCategoryId");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryIdNotEqualTo(String value) {
            addCriterion("course_category_id <>", value, "courseCategoryId");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryIdGreaterThan(String value) {
            addCriterion("course_category_id >", value, "courseCategoryId");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("course_category_id >=", value, "courseCategoryId");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryIdLessThan(String value) {
            addCriterion("course_category_id <", value, "courseCategoryId");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("course_category_id <=", value, "courseCategoryId");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryIdLike(String value) {
            addCriterion("course_category_id like", value, "courseCategoryId");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryIdNotLike(String value) {
            addCriterion("course_category_id not like", value, "courseCategoryId");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryIdIn(List<String> values) {
            addCriterion("course_category_id in", values, "courseCategoryId");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryIdNotIn(List<String> values) {
            addCriterion("course_category_id not in", values, "courseCategoryId");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryIdBetween(String value1, String value2) {
            addCriterion("course_category_id between", value1, value2, "courseCategoryId");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryIdNotBetween(String value1, String value2) {
            addCriterion("course_category_id not between", value1, value2, "courseCategoryId");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryNameIsNull() {
            addCriterion("course_category_name is null");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryNameIsNotNull() {
            addCriterion("course_category_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryNameEqualTo(String value) {
            addCriterion("course_category_name =", value, "courseCategoryName");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryNameNotEqualTo(String value) {
            addCriterion("course_category_name <>", value, "courseCategoryName");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryNameGreaterThan(String value) {
            addCriterion("course_category_name >", value, "courseCategoryName");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("course_category_name >=", value, "courseCategoryName");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryNameLessThan(String value) {
            addCriterion("course_category_name <", value, "courseCategoryName");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("course_category_name <=", value, "courseCategoryName");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryNameLike(String value) {
            addCriterion("course_category_name like", value, "courseCategoryName");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryNameNotLike(String value) {
            addCriterion("course_category_name not like", value, "courseCategoryName");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryNameIn(List<String> values) {
            addCriterion("course_category_name in", values, "courseCategoryName");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryNameNotIn(List<String> values) {
            addCriterion("course_category_name not in", values, "courseCategoryName");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryNameBetween(String value1, String value2) {
            addCriterion("course_category_name between", value1, value2, "courseCategoryName");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryNameNotBetween(String value1, String value2) {
            addCriterion("course_category_name not between", value1, value2, "courseCategoryName");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryDescriptionIsNull() {
            addCriterion("course_category_description is null");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryDescriptionIsNotNull() {
            addCriterion("course_category_description is not null");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryDescriptionEqualTo(String value) {
            addCriterion("course_category_description =", value, "courseCategoryDescription");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryDescriptionNotEqualTo(String value) {
            addCriterion("course_category_description <>", value, "courseCategoryDescription");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryDescriptionGreaterThan(String value) {
            addCriterion("course_category_description >", value, "courseCategoryDescription");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("course_category_description >=", value, "courseCategoryDescription");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryDescriptionLessThan(String value) {
            addCriterion("course_category_description <", value, "courseCategoryDescription");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryDescriptionLessThanOrEqualTo(String value) {
            addCriterion("course_category_description <=", value, "courseCategoryDescription");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryDescriptionLike(String value) {
            addCriterion("course_category_description like", value, "courseCategoryDescription");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryDescriptionNotLike(String value) {
            addCriterion("course_category_description not like", value, "courseCategoryDescription");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryDescriptionIn(List<String> values) {
            addCriterion("course_category_description in", values, "courseCategoryDescription");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryDescriptionNotIn(List<String> values) {
            addCriterion("course_category_description not in", values, "courseCategoryDescription");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryDescriptionBetween(String value1, String value2) {
            addCriterion("course_category_description between", value1, value2, "courseCategoryDescription");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryDescriptionNotBetween(String value1, String value2) {
            addCriterion("course_category_description not between", value1, value2, "courseCategoryDescription");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryImageIsNull() {
            addCriterion("course_category_image is null");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryImageIsNotNull() {
            addCriterion("course_category_image is not null");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryImageEqualTo(String value) {
            addCriterion("course_category_image =", value, "courseCategoryImage");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryImageNotEqualTo(String value) {
            addCriterion("course_category_image <>", value, "courseCategoryImage");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryImageGreaterThan(String value) {
            addCriterion("course_category_image >", value, "courseCategoryImage");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryImageGreaterThanOrEqualTo(String value) {
            addCriterion("course_category_image >=", value, "courseCategoryImage");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryImageLessThan(String value) {
            addCriterion("course_category_image <", value, "courseCategoryImage");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryImageLessThanOrEqualTo(String value) {
            addCriterion("course_category_image <=", value, "courseCategoryImage");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryImageLike(String value) {
            addCriterion("course_category_image like", value, "courseCategoryImage");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryImageNotLike(String value) {
            addCriterion("course_category_image not like", value, "courseCategoryImage");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryImageIn(List<String> values) {
            addCriterion("course_category_image in", values, "courseCategoryImage");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryImageNotIn(List<String> values) {
            addCriterion("course_category_image not in", values, "courseCategoryImage");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryImageBetween(String value1, String value2) {
            addCriterion("course_category_image between", value1, value2, "courseCategoryImage");
            return (Criteria) this;
        }

        public Criteria andCourseCategoryImageNotBetween(String value1, String value2) {
            addCriterion("course_category_image not between", value1, value2, "courseCategoryImage");
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