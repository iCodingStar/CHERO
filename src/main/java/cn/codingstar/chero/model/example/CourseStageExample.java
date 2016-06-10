package cn.codingstar.chero.model.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CourseStageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseStageExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andStageIdIsNull() {
            addCriterion("stage_id is null");
            return (Criteria) this;
        }

        public Criteria andStageIdIsNotNull() {
            addCriterion("stage_id is not null");
            return (Criteria) this;
        }

        public Criteria andStageIdEqualTo(String value) {
            addCriterion("stage_id =", value, "stageId");
            return (Criteria) this;
        }

        public Criteria andStageIdNotEqualTo(String value) {
            addCriterion("stage_id <>", value, "stageId");
            return (Criteria) this;
        }

        public Criteria andStageIdGreaterThan(String value) {
            addCriterion("stage_id >", value, "stageId");
            return (Criteria) this;
        }

        public Criteria andStageIdGreaterThanOrEqualTo(String value) {
            addCriterion("stage_id >=", value, "stageId");
            return (Criteria) this;
        }

        public Criteria andStageIdLessThan(String value) {
            addCriterion("stage_id <", value, "stageId");
            return (Criteria) this;
        }

        public Criteria andStageIdLessThanOrEqualTo(String value) {
            addCriterion("stage_id <=", value, "stageId");
            return (Criteria) this;
        }

        public Criteria andStageIdLike(String value) {
            addCriterion("stage_id like", value, "stageId");
            return (Criteria) this;
        }

        public Criteria andStageIdNotLike(String value) {
            addCriterion("stage_id not like", value, "stageId");
            return (Criteria) this;
        }

        public Criteria andStageIdIn(List<String> values) {
            addCriterion("stage_id in", values, "stageId");
            return (Criteria) this;
        }

        public Criteria andStageIdNotIn(List<String> values) {
            addCriterion("stage_id not in", values, "stageId");
            return (Criteria) this;
        }

        public Criteria andStageIdBetween(String value1, String value2) {
            addCriterion("stage_id between", value1, value2, "stageId");
            return (Criteria) this;
        }

        public Criteria andStageIdNotBetween(String value1, String value2) {
            addCriterion("stage_id not between", value1, value2, "stageId");
            return (Criteria) this;
        }

        public Criteria andStageTimesIsNull() {
            addCriterion("stage_times is null");
            return (Criteria) this;
        }

        public Criteria andStageTimesIsNotNull() {
            addCriterion("stage_times is not null");
            return (Criteria) this;
        }

        public Criteria andStageTimesEqualTo(Integer value) {
            addCriterion("stage_times =", value, "stageTimes");
            return (Criteria) this;
        }

        public Criteria andStageTimesNotEqualTo(Integer value) {
            addCriterion("stage_times <>", value, "stageTimes");
            return (Criteria) this;
        }

        public Criteria andStageTimesGreaterThan(Integer value) {
            addCriterion("stage_times >", value, "stageTimes");
            return (Criteria) this;
        }

        public Criteria andStageTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("stage_times >=", value, "stageTimes");
            return (Criteria) this;
        }

        public Criteria andStageTimesLessThan(Integer value) {
            addCriterion("stage_times <", value, "stageTimes");
            return (Criteria) this;
        }

        public Criteria andStageTimesLessThanOrEqualTo(Integer value) {
            addCriterion("stage_times <=", value, "stageTimes");
            return (Criteria) this;
        }

        public Criteria andStageTimesIn(List<Integer> values) {
            addCriterion("stage_times in", values, "stageTimes");
            return (Criteria) this;
        }

        public Criteria andStageTimesNotIn(List<Integer> values) {
            addCriterion("stage_times not in", values, "stageTimes");
            return (Criteria) this;
        }

        public Criteria andStageTimesBetween(Integer value1, Integer value2) {
            addCriterion("stage_times between", value1, value2, "stageTimes");
            return (Criteria) this;
        }

        public Criteria andStageTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("stage_times not between", value1, value2, "stageTimes");
            return (Criteria) this;
        }

        public Criteria andStageCapacityIsNull() {
            addCriterion("stage_capacity is null");
            return (Criteria) this;
        }

        public Criteria andStageCapacityIsNotNull() {
            addCriterion("stage_capacity is not null");
            return (Criteria) this;
        }

        public Criteria andStageCapacityEqualTo(Integer value) {
            addCriterion("stage_capacity =", value, "stageCapacity");
            return (Criteria) this;
        }

        public Criteria andStageCapacityNotEqualTo(Integer value) {
            addCriterion("stage_capacity <>", value, "stageCapacity");
            return (Criteria) this;
        }

        public Criteria andStageCapacityGreaterThan(Integer value) {
            addCriterion("stage_capacity >", value, "stageCapacity");
            return (Criteria) this;
        }

        public Criteria andStageCapacityGreaterThanOrEqualTo(Integer value) {
            addCriterion("stage_capacity >=", value, "stageCapacity");
            return (Criteria) this;
        }

        public Criteria andStageCapacityLessThan(Integer value) {
            addCriterion("stage_capacity <", value, "stageCapacity");
            return (Criteria) this;
        }

        public Criteria andStageCapacityLessThanOrEqualTo(Integer value) {
            addCriterion("stage_capacity <=", value, "stageCapacity");
            return (Criteria) this;
        }

        public Criteria andStageCapacityIn(List<Integer> values) {
            addCriterion("stage_capacity in", values, "stageCapacity");
            return (Criteria) this;
        }

        public Criteria andStageCapacityNotIn(List<Integer> values) {
            addCriterion("stage_capacity not in", values, "stageCapacity");
            return (Criteria) this;
        }

        public Criteria andStageCapacityBetween(Integer value1, Integer value2) {
            addCriterion("stage_capacity between", value1, value2, "stageCapacity");
            return (Criteria) this;
        }

        public Criteria andStageCapacityNotBetween(Integer value1, Integer value2) {
            addCriterion("stage_capacity not between", value1, value2, "stageCapacity");
            return (Criteria) this;
        }

        public Criteria andStageLeftCapacityIsNull() {
            addCriterion("stage_left_capacity is null");
            return (Criteria) this;
        }

        public Criteria andStageLeftCapacityIsNotNull() {
            addCriterion("stage_left_capacity is not null");
            return (Criteria) this;
        }

        public Criteria andStageLeftCapacityEqualTo(Integer value) {
            addCriterion("stage_left_capacity =", value, "stageLeftCapacity");
            return (Criteria) this;
        }

        public Criteria andStageLeftCapacityNotEqualTo(Integer value) {
            addCriterion("stage_left_capacity <>", value, "stageLeftCapacity");
            return (Criteria) this;
        }

        public Criteria andStageLeftCapacityGreaterThan(Integer value) {
            addCriterion("stage_left_capacity >", value, "stageLeftCapacity");
            return (Criteria) this;
        }

        public Criteria andStageLeftCapacityGreaterThanOrEqualTo(Integer value) {
            addCriterion("stage_left_capacity >=", value, "stageLeftCapacity");
            return (Criteria) this;
        }

        public Criteria andStageLeftCapacityLessThan(Integer value) {
            addCriterion("stage_left_capacity <", value, "stageLeftCapacity");
            return (Criteria) this;
        }

        public Criteria andStageLeftCapacityLessThanOrEqualTo(Integer value) {
            addCriterion("stage_left_capacity <=", value, "stageLeftCapacity");
            return (Criteria) this;
        }

        public Criteria andStageLeftCapacityIn(List<Integer> values) {
            addCriterion("stage_left_capacity in", values, "stageLeftCapacity");
            return (Criteria) this;
        }

        public Criteria andStageLeftCapacityNotIn(List<Integer> values) {
            addCriterion("stage_left_capacity not in", values, "stageLeftCapacity");
            return (Criteria) this;
        }

        public Criteria andStageLeftCapacityBetween(Integer value1, Integer value2) {
            addCriterion("stage_left_capacity between", value1, value2, "stageLeftCapacity");
            return (Criteria) this;
        }

        public Criteria andStageLeftCapacityNotBetween(Integer value1, Integer value2) {
            addCriterion("stage_left_capacity not between", value1, value2, "stageLeftCapacity");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(String value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(String value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(String value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(String value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(String value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(String value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLike(String value) {
            addCriterion("course_id like", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotLike(String value) {
            addCriterion("course_id not like", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<String> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<String> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(String value1, String value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(String value1, String value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andStageNameIsNull() {
            addCriterion("stage_name is null");
            return (Criteria) this;
        }

        public Criteria andStageNameIsNotNull() {
            addCriterion("stage_name is not null");
            return (Criteria) this;
        }

        public Criteria andStageNameEqualTo(String value) {
            addCriterion("stage_name =", value, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameNotEqualTo(String value) {
            addCriterion("stage_name <>", value, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameGreaterThan(String value) {
            addCriterion("stage_name >", value, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameGreaterThanOrEqualTo(String value) {
            addCriterion("stage_name >=", value, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameLessThan(String value) {
            addCriterion("stage_name <", value, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameLessThanOrEqualTo(String value) {
            addCriterion("stage_name <=", value, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameLike(String value) {
            addCriterion("stage_name like", value, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameNotLike(String value) {
            addCriterion("stage_name not like", value, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameIn(List<String> values) {
            addCriterion("stage_name in", values, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameNotIn(List<String> values) {
            addCriterion("stage_name not in", values, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameBetween(String value1, String value2) {
            addCriterion("stage_name between", value1, value2, "stageName");
            return (Criteria) this;
        }

        public Criteria andStageNameNotBetween(String value1, String value2) {
            addCriterion("stage_name not between", value1, value2, "stageName");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterionForJDBCDate("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterionForJDBCDate("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterionForJDBCDate("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andCourseStagePriceIsNull() {
            addCriterion("course_stage_price is null");
            return (Criteria) this;
        }

        public Criteria andCourseStagePriceIsNotNull() {
            addCriterion("course_stage_price is not null");
            return (Criteria) this;
        }

        public Criteria andCourseStagePriceEqualTo(Double value) {
            addCriterion("course_stage_price =", value, "courseStagePrice");
            return (Criteria) this;
        }

        public Criteria andCourseStagePriceNotEqualTo(Double value) {
            addCriterion("course_stage_price <>", value, "courseStagePrice");
            return (Criteria) this;
        }

        public Criteria andCourseStagePriceGreaterThan(Double value) {
            addCriterion("course_stage_price >", value, "courseStagePrice");
            return (Criteria) this;
        }

        public Criteria andCourseStagePriceGreaterThanOrEqualTo(Double value) {
            addCriterion("course_stage_price >=", value, "courseStagePrice");
            return (Criteria) this;
        }

        public Criteria andCourseStagePriceLessThan(Double value) {
            addCriterion("course_stage_price <", value, "courseStagePrice");
            return (Criteria) this;
        }

        public Criteria andCourseStagePriceLessThanOrEqualTo(Double value) {
            addCriterion("course_stage_price <=", value, "courseStagePrice");
            return (Criteria) this;
        }

        public Criteria andCourseStagePriceIn(List<Double> values) {
            addCriterion("course_stage_price in", values, "courseStagePrice");
            return (Criteria) this;
        }

        public Criteria andCourseStagePriceNotIn(List<Double> values) {
            addCriterion("course_stage_price not in", values, "courseStagePrice");
            return (Criteria) this;
        }

        public Criteria andCourseStagePriceBetween(Double value1, Double value2) {
            addCriterion("course_stage_price between", value1, value2, "courseStagePrice");
            return (Criteria) this;
        }

        public Criteria andCourseStagePriceNotBetween(Double value1, Double value2) {
            addCriterion("course_stage_price not between", value1, value2, "courseStagePrice");
            return (Criteria) this;
        }

        public Criteria andStageScheduleImageIsNull() {
            addCriterion("stage_schedule_image is null");
            return (Criteria) this;
        }

        public Criteria andStageScheduleImageIsNotNull() {
            addCriterion("stage_schedule_image is not null");
            return (Criteria) this;
        }

        public Criteria andStageScheduleImageEqualTo(String value) {
            addCriterion("stage_schedule_image =", value, "stageScheduleImage");
            return (Criteria) this;
        }

        public Criteria andStageScheduleImageNotEqualTo(String value) {
            addCriterion("stage_schedule_image <>", value, "stageScheduleImage");
            return (Criteria) this;
        }

        public Criteria andStageScheduleImageGreaterThan(String value) {
            addCriterion("stage_schedule_image >", value, "stageScheduleImage");
            return (Criteria) this;
        }

        public Criteria andStageScheduleImageGreaterThanOrEqualTo(String value) {
            addCriterion("stage_schedule_image >=", value, "stageScheduleImage");
            return (Criteria) this;
        }

        public Criteria andStageScheduleImageLessThan(String value) {
            addCriterion("stage_schedule_image <", value, "stageScheduleImage");
            return (Criteria) this;
        }

        public Criteria andStageScheduleImageLessThanOrEqualTo(String value) {
            addCriterion("stage_schedule_image <=", value, "stageScheduleImage");
            return (Criteria) this;
        }

        public Criteria andStageScheduleImageLike(String value) {
            addCriterion("stage_schedule_image like", value, "stageScheduleImage");
            return (Criteria) this;
        }

        public Criteria andStageScheduleImageNotLike(String value) {
            addCriterion("stage_schedule_image not like", value, "stageScheduleImage");
            return (Criteria) this;
        }

        public Criteria andStageScheduleImageIn(List<String> values) {
            addCriterion("stage_schedule_image in", values, "stageScheduleImage");
            return (Criteria) this;
        }

        public Criteria andStageScheduleImageNotIn(List<String> values) {
            addCriterion("stage_schedule_image not in", values, "stageScheduleImage");
            return (Criteria) this;
        }

        public Criteria andStageScheduleImageBetween(String value1, String value2) {
            addCriterion("stage_schedule_image between", value1, value2, "stageScheduleImage");
            return (Criteria) this;
        }

        public Criteria andStageScheduleImageNotBetween(String value1, String value2) {
            addCriterion("stage_schedule_image not between", value1, value2, "stageScheduleImage");
            return (Criteria) this;
        }

        public Criteria andStagePosterImageIsNull() {
            addCriterion("stage_poster_image is null");
            return (Criteria) this;
        }

        public Criteria andStagePosterImageIsNotNull() {
            addCriterion("stage_poster_image is not null");
            return (Criteria) this;
        }

        public Criteria andStagePosterImageEqualTo(String value) {
            addCriterion("stage_poster_image =", value, "stagePosterImage");
            return (Criteria) this;
        }

        public Criteria andStagePosterImageNotEqualTo(String value) {
            addCriterion("stage_poster_image <>", value, "stagePosterImage");
            return (Criteria) this;
        }

        public Criteria andStagePosterImageGreaterThan(String value) {
            addCriterion("stage_poster_image >", value, "stagePosterImage");
            return (Criteria) this;
        }

        public Criteria andStagePosterImageGreaterThanOrEqualTo(String value) {
            addCriterion("stage_poster_image >=", value, "stagePosterImage");
            return (Criteria) this;
        }

        public Criteria andStagePosterImageLessThan(String value) {
            addCriterion("stage_poster_image <", value, "stagePosterImage");
            return (Criteria) this;
        }

        public Criteria andStagePosterImageLessThanOrEqualTo(String value) {
            addCriterion("stage_poster_image <=", value, "stagePosterImage");
            return (Criteria) this;
        }

        public Criteria andStagePosterImageLike(String value) {
            addCriterion("stage_poster_image like", value, "stagePosterImage");
            return (Criteria) this;
        }

        public Criteria andStagePosterImageNotLike(String value) {
            addCriterion("stage_poster_image not like", value, "stagePosterImage");
            return (Criteria) this;
        }

        public Criteria andStagePosterImageIn(List<String> values) {
            addCriterion("stage_poster_image in", values, "stagePosterImage");
            return (Criteria) this;
        }

        public Criteria andStagePosterImageNotIn(List<String> values) {
            addCriterion("stage_poster_image not in", values, "stagePosterImage");
            return (Criteria) this;
        }

        public Criteria andStagePosterImageBetween(String value1, String value2) {
            addCriterion("stage_poster_image between", value1, value2, "stagePosterImage");
            return (Criteria) this;
        }

        public Criteria andStagePosterImageNotBetween(String value1, String value2) {
            addCriterion("stage_poster_image not between", value1, value2, "stagePosterImage");
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