package cn.codingstar.chero.model.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TrainerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainerExample() {
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

        public Criteria andTrainerIdIsNull() {
            addCriterion("trainer_id is null");
            return (Criteria) this;
        }

        public Criteria andTrainerIdIsNotNull() {
            addCriterion("trainer_id is not null");
            return (Criteria) this;
        }

        public Criteria andTrainerIdEqualTo(String value) {
            addCriterion("trainer_id =", value, "trainerId");
            return (Criteria) this;
        }

        public Criteria andTrainerIdNotEqualTo(String value) {
            addCriterion("trainer_id <>", value, "trainerId");
            return (Criteria) this;
        }

        public Criteria andTrainerIdGreaterThan(String value) {
            addCriterion("trainer_id >", value, "trainerId");
            return (Criteria) this;
        }

        public Criteria andTrainerIdGreaterThanOrEqualTo(String value) {
            addCriterion("trainer_id >=", value, "trainerId");
            return (Criteria) this;
        }

        public Criteria andTrainerIdLessThan(String value) {
            addCriterion("trainer_id <", value, "trainerId");
            return (Criteria) this;
        }

        public Criteria andTrainerIdLessThanOrEqualTo(String value) {
            addCriterion("trainer_id <=", value, "trainerId");
            return (Criteria) this;
        }

        public Criteria andTrainerIdLike(String value) {
            addCriterion("trainer_id like", value, "trainerId");
            return (Criteria) this;
        }

        public Criteria andTrainerIdNotLike(String value) {
            addCriterion("trainer_id not like", value, "trainerId");
            return (Criteria) this;
        }

        public Criteria andTrainerIdIn(List<String> values) {
            addCriterion("trainer_id in", values, "trainerId");
            return (Criteria) this;
        }

        public Criteria andTrainerIdNotIn(List<String> values) {
            addCriterion("trainer_id not in", values, "trainerId");
            return (Criteria) this;
        }

        public Criteria andTrainerIdBetween(String value1, String value2) {
            addCriterion("trainer_id between", value1, value2, "trainerId");
            return (Criteria) this;
        }

        public Criteria andTrainerIdNotBetween(String value1, String value2) {
            addCriterion("trainer_id not between", value1, value2, "trainerId");
            return (Criteria) this;
        }

        public Criteria andTrainerNicknameIsNull() {
            addCriterion("trainer_nickname is null");
            return (Criteria) this;
        }

        public Criteria andTrainerNicknameIsNotNull() {
            addCriterion("trainer_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andTrainerNicknameEqualTo(String value) {
            addCriterion("trainer_nickname =", value, "trainerNickname");
            return (Criteria) this;
        }

        public Criteria andTrainerNicknameNotEqualTo(String value) {
            addCriterion("trainer_nickname <>", value, "trainerNickname");
            return (Criteria) this;
        }

        public Criteria andTrainerNicknameGreaterThan(String value) {
            addCriterion("trainer_nickname >", value, "trainerNickname");
            return (Criteria) this;
        }

        public Criteria andTrainerNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("trainer_nickname >=", value, "trainerNickname");
            return (Criteria) this;
        }

        public Criteria andTrainerNicknameLessThan(String value) {
            addCriterion("trainer_nickname <", value, "trainerNickname");
            return (Criteria) this;
        }

        public Criteria andTrainerNicknameLessThanOrEqualTo(String value) {
            addCriterion("trainer_nickname <=", value, "trainerNickname");
            return (Criteria) this;
        }

        public Criteria andTrainerNicknameLike(String value) {
            addCriterion("trainer_nickname like", value, "trainerNickname");
            return (Criteria) this;
        }

        public Criteria andTrainerNicknameNotLike(String value) {
            addCriterion("trainer_nickname not like", value, "trainerNickname");
            return (Criteria) this;
        }

        public Criteria andTrainerNicknameIn(List<String> values) {
            addCriterion("trainer_nickname in", values, "trainerNickname");
            return (Criteria) this;
        }

        public Criteria andTrainerNicknameNotIn(List<String> values) {
            addCriterion("trainer_nickname not in", values, "trainerNickname");
            return (Criteria) this;
        }

        public Criteria andTrainerNicknameBetween(String value1, String value2) {
            addCriterion("trainer_nickname between", value1, value2, "trainerNickname");
            return (Criteria) this;
        }

        public Criteria andTrainerNicknameNotBetween(String value1, String value2) {
            addCriterion("trainer_nickname not between", value1, value2, "trainerNickname");
            return (Criteria) this;
        }

        public Criteria andTrainerNameIsNull() {
            addCriterion("trainer_name is null");
            return (Criteria) this;
        }

        public Criteria andTrainerNameIsNotNull() {
            addCriterion("trainer_name is not null");
            return (Criteria) this;
        }

        public Criteria andTrainerNameEqualTo(String value) {
            addCriterion("trainer_name =", value, "trainerName");
            return (Criteria) this;
        }

        public Criteria andTrainerNameNotEqualTo(String value) {
            addCriterion("trainer_name <>", value, "trainerName");
            return (Criteria) this;
        }

        public Criteria andTrainerNameGreaterThan(String value) {
            addCriterion("trainer_name >", value, "trainerName");
            return (Criteria) this;
        }

        public Criteria andTrainerNameGreaterThanOrEqualTo(String value) {
            addCriterion("trainer_name >=", value, "trainerName");
            return (Criteria) this;
        }

        public Criteria andTrainerNameLessThan(String value) {
            addCriterion("trainer_name <", value, "trainerName");
            return (Criteria) this;
        }

        public Criteria andTrainerNameLessThanOrEqualTo(String value) {
            addCriterion("trainer_name <=", value, "trainerName");
            return (Criteria) this;
        }

        public Criteria andTrainerNameLike(String value) {
            addCriterion("trainer_name like", value, "trainerName");
            return (Criteria) this;
        }

        public Criteria andTrainerNameNotLike(String value) {
            addCriterion("trainer_name not like", value, "trainerName");
            return (Criteria) this;
        }

        public Criteria andTrainerNameIn(List<String> values) {
            addCriterion("trainer_name in", values, "trainerName");
            return (Criteria) this;
        }

        public Criteria andTrainerNameNotIn(List<String> values) {
            addCriterion("trainer_name not in", values, "trainerName");
            return (Criteria) this;
        }

        public Criteria andTrainerNameBetween(String value1, String value2) {
            addCriterion("trainer_name between", value1, value2, "trainerName");
            return (Criteria) this;
        }

        public Criteria andTrainerNameNotBetween(String value1, String value2) {
            addCriterion("trainer_name not between", value1, value2, "trainerName");
            return (Criteria) this;
        }

        public Criteria andTrainerImageIsNull() {
            addCriterion("trainer_image is null");
            return (Criteria) this;
        }

        public Criteria andTrainerImageIsNotNull() {
            addCriterion("trainer_image is not null");
            return (Criteria) this;
        }

        public Criteria andTrainerImageEqualTo(String value) {
            addCriterion("trainer_image =", value, "trainerImage");
            return (Criteria) this;
        }

        public Criteria andTrainerImageNotEqualTo(String value) {
            addCriterion("trainer_image <>", value, "trainerImage");
            return (Criteria) this;
        }

        public Criteria andTrainerImageGreaterThan(String value) {
            addCriterion("trainer_image >", value, "trainerImage");
            return (Criteria) this;
        }

        public Criteria andTrainerImageGreaterThanOrEqualTo(String value) {
            addCriterion("trainer_image >=", value, "trainerImage");
            return (Criteria) this;
        }

        public Criteria andTrainerImageLessThan(String value) {
            addCriterion("trainer_image <", value, "trainerImage");
            return (Criteria) this;
        }

        public Criteria andTrainerImageLessThanOrEqualTo(String value) {
            addCriterion("trainer_image <=", value, "trainerImage");
            return (Criteria) this;
        }

        public Criteria andTrainerImageLike(String value) {
            addCriterion("trainer_image like", value, "trainerImage");
            return (Criteria) this;
        }

        public Criteria andTrainerImageNotLike(String value) {
            addCriterion("trainer_image not like", value, "trainerImage");
            return (Criteria) this;
        }

        public Criteria andTrainerImageIn(List<String> values) {
            addCriterion("trainer_image in", values, "trainerImage");
            return (Criteria) this;
        }

        public Criteria andTrainerImageNotIn(List<String> values) {
            addCriterion("trainer_image not in", values, "trainerImage");
            return (Criteria) this;
        }

        public Criteria andTrainerImageBetween(String value1, String value2) {
            addCriterion("trainer_image between", value1, value2, "trainerImage");
            return (Criteria) this;
        }

        public Criteria andTrainerImageNotBetween(String value1, String value2) {
            addCriterion("trainer_image not between", value1, value2, "trainerImage");
            return (Criteria) this;
        }

        public Criteria andTrainerInfoIsNull() {
            addCriterion("trainer_info is null");
            return (Criteria) this;
        }

        public Criteria andTrainerInfoIsNotNull() {
            addCriterion("trainer_info is not null");
            return (Criteria) this;
        }

        public Criteria andTrainerInfoEqualTo(String value) {
            addCriterion("trainer_info =", value, "trainerInfo");
            return (Criteria) this;
        }

        public Criteria andTrainerInfoNotEqualTo(String value) {
            addCriterion("trainer_info <>", value, "trainerInfo");
            return (Criteria) this;
        }

        public Criteria andTrainerInfoGreaterThan(String value) {
            addCriterion("trainer_info >", value, "trainerInfo");
            return (Criteria) this;
        }

        public Criteria andTrainerInfoGreaterThanOrEqualTo(String value) {
            addCriterion("trainer_info >=", value, "trainerInfo");
            return (Criteria) this;
        }

        public Criteria andTrainerInfoLessThan(String value) {
            addCriterion("trainer_info <", value, "trainerInfo");
            return (Criteria) this;
        }

        public Criteria andTrainerInfoLessThanOrEqualTo(String value) {
            addCriterion("trainer_info <=", value, "trainerInfo");
            return (Criteria) this;
        }

        public Criteria andTrainerInfoLike(String value) {
            addCriterion("trainer_info like", value, "trainerInfo");
            return (Criteria) this;
        }

        public Criteria andTrainerInfoNotLike(String value) {
            addCriterion("trainer_info not like", value, "trainerInfo");
            return (Criteria) this;
        }

        public Criteria andTrainerInfoIn(List<String> values) {
            addCriterion("trainer_info in", values, "trainerInfo");
            return (Criteria) this;
        }

        public Criteria andTrainerInfoNotIn(List<String> values) {
            addCriterion("trainer_info not in", values, "trainerInfo");
            return (Criteria) this;
        }

        public Criteria andTrainerInfoBetween(String value1, String value2) {
            addCriterion("trainer_info between", value1, value2, "trainerInfo");
            return (Criteria) this;
        }

        public Criteria andTrainerInfoNotBetween(String value1, String value2) {
            addCriterion("trainer_info not between", value1, value2, "trainerInfo");
            return (Criteria) this;
        }

        public Criteria andTrainerSexIsNull() {
            addCriterion("trainer_sex is null");
            return (Criteria) this;
        }

        public Criteria andTrainerSexIsNotNull() {
            addCriterion("trainer_sex is not null");
            return (Criteria) this;
        }

        public Criteria andTrainerSexEqualTo(String value) {
            addCriterion("trainer_sex =", value, "trainerSex");
            return (Criteria) this;
        }

        public Criteria andTrainerSexNotEqualTo(String value) {
            addCriterion("trainer_sex <>", value, "trainerSex");
            return (Criteria) this;
        }

        public Criteria andTrainerSexGreaterThan(String value) {
            addCriterion("trainer_sex >", value, "trainerSex");
            return (Criteria) this;
        }

        public Criteria andTrainerSexGreaterThanOrEqualTo(String value) {
            addCriterion("trainer_sex >=", value, "trainerSex");
            return (Criteria) this;
        }

        public Criteria andTrainerSexLessThan(String value) {
            addCriterion("trainer_sex <", value, "trainerSex");
            return (Criteria) this;
        }

        public Criteria andTrainerSexLessThanOrEqualTo(String value) {
            addCriterion("trainer_sex <=", value, "trainerSex");
            return (Criteria) this;
        }

        public Criteria andTrainerSexLike(String value) {
            addCriterion("trainer_sex like", value, "trainerSex");
            return (Criteria) this;
        }

        public Criteria andTrainerSexNotLike(String value) {
            addCriterion("trainer_sex not like", value, "trainerSex");
            return (Criteria) this;
        }

        public Criteria andTrainerSexIn(List<String> values) {
            addCriterion("trainer_sex in", values, "trainerSex");
            return (Criteria) this;
        }

        public Criteria andTrainerSexNotIn(List<String> values) {
            addCriterion("trainer_sex not in", values, "trainerSex");
            return (Criteria) this;
        }

        public Criteria andTrainerSexBetween(String value1, String value2) {
            addCriterion("trainer_sex between", value1, value2, "trainerSex");
            return (Criteria) this;
        }

        public Criteria andTrainerSexNotBetween(String value1, String value2) {
            addCriterion("trainer_sex not between", value1, value2, "trainerSex");
            return (Criteria) this;
        }

        public Criteria andTrainerBirthdayIsNull() {
            addCriterion("trainer_birthday is null");
            return (Criteria) this;
        }

        public Criteria andTrainerBirthdayIsNotNull() {
            addCriterion("trainer_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andTrainerBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("trainer_birthday =", value, "trainerBirthday");
            return (Criteria) this;
        }

        public Criteria andTrainerBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("trainer_birthday <>", value, "trainerBirthday");
            return (Criteria) this;
        }

        public Criteria andTrainerBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("trainer_birthday >", value, "trainerBirthday");
            return (Criteria) this;
        }

        public Criteria andTrainerBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("trainer_birthday >=", value, "trainerBirthday");
            return (Criteria) this;
        }

        public Criteria andTrainerBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("trainer_birthday <", value, "trainerBirthday");
            return (Criteria) this;
        }

        public Criteria andTrainerBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("trainer_birthday <=", value, "trainerBirthday");
            return (Criteria) this;
        }

        public Criteria andTrainerBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("trainer_birthday in", values, "trainerBirthday");
            return (Criteria) this;
        }

        public Criteria andTrainerBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("trainer_birthday not in", values, "trainerBirthday");
            return (Criteria) this;
        }

        public Criteria andTrainerBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("trainer_birthday between", value1, value2, "trainerBirthday");
            return (Criteria) this;
        }

        public Criteria andTrainerBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("trainer_birthday not between", value1, value2, "trainerBirthday");
            return (Criteria) this;
        }

        public Criteria andTrainerTelephoneIsNull() {
            addCriterion("trainer_telephone is null");
            return (Criteria) this;
        }

        public Criteria andTrainerTelephoneIsNotNull() {
            addCriterion("trainer_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTrainerTelephoneEqualTo(String value) {
            addCriterion("trainer_telephone =", value, "trainerTelephone");
            return (Criteria) this;
        }

        public Criteria andTrainerTelephoneNotEqualTo(String value) {
            addCriterion("trainer_telephone <>", value, "trainerTelephone");
            return (Criteria) this;
        }

        public Criteria andTrainerTelephoneGreaterThan(String value) {
            addCriterion("trainer_telephone >", value, "trainerTelephone");
            return (Criteria) this;
        }

        public Criteria andTrainerTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("trainer_telephone >=", value, "trainerTelephone");
            return (Criteria) this;
        }

        public Criteria andTrainerTelephoneLessThan(String value) {
            addCriterion("trainer_telephone <", value, "trainerTelephone");
            return (Criteria) this;
        }

        public Criteria andTrainerTelephoneLessThanOrEqualTo(String value) {
            addCriterion("trainer_telephone <=", value, "trainerTelephone");
            return (Criteria) this;
        }

        public Criteria andTrainerTelephoneLike(String value) {
            addCriterion("trainer_telephone like", value, "trainerTelephone");
            return (Criteria) this;
        }

        public Criteria andTrainerTelephoneNotLike(String value) {
            addCriterion("trainer_telephone not like", value, "trainerTelephone");
            return (Criteria) this;
        }

        public Criteria andTrainerTelephoneIn(List<String> values) {
            addCriterion("trainer_telephone in", values, "trainerTelephone");
            return (Criteria) this;
        }

        public Criteria andTrainerTelephoneNotIn(List<String> values) {
            addCriterion("trainer_telephone not in", values, "trainerTelephone");
            return (Criteria) this;
        }

        public Criteria andTrainerTelephoneBetween(String value1, String value2) {
            addCriterion("trainer_telephone between", value1, value2, "trainerTelephone");
            return (Criteria) this;
        }

        public Criteria andTrainerTelephoneNotBetween(String value1, String value2) {
            addCriterion("trainer_telephone not between", value1, value2, "trainerTelephone");
            return (Criteria) this;
        }

        public Criteria andTrainerHomePhoneIsNull() {
            addCriterion("trainer_home_phone is null");
            return (Criteria) this;
        }

        public Criteria andTrainerHomePhoneIsNotNull() {
            addCriterion("trainer_home_phone is not null");
            return (Criteria) this;
        }

        public Criteria andTrainerHomePhoneEqualTo(String value) {
            addCriterion("trainer_home_phone =", value, "trainerHomePhone");
            return (Criteria) this;
        }

        public Criteria andTrainerHomePhoneNotEqualTo(String value) {
            addCriterion("trainer_home_phone <>", value, "trainerHomePhone");
            return (Criteria) this;
        }

        public Criteria andTrainerHomePhoneGreaterThan(String value) {
            addCriterion("trainer_home_phone >", value, "trainerHomePhone");
            return (Criteria) this;
        }

        public Criteria andTrainerHomePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("trainer_home_phone >=", value, "trainerHomePhone");
            return (Criteria) this;
        }

        public Criteria andTrainerHomePhoneLessThan(String value) {
            addCriterion("trainer_home_phone <", value, "trainerHomePhone");
            return (Criteria) this;
        }

        public Criteria andTrainerHomePhoneLessThanOrEqualTo(String value) {
            addCriterion("trainer_home_phone <=", value, "trainerHomePhone");
            return (Criteria) this;
        }

        public Criteria andTrainerHomePhoneLike(String value) {
            addCriterion("trainer_home_phone like", value, "trainerHomePhone");
            return (Criteria) this;
        }

        public Criteria andTrainerHomePhoneNotLike(String value) {
            addCriterion("trainer_home_phone not like", value, "trainerHomePhone");
            return (Criteria) this;
        }

        public Criteria andTrainerHomePhoneIn(List<String> values) {
            addCriterion("trainer_home_phone in", values, "trainerHomePhone");
            return (Criteria) this;
        }

        public Criteria andTrainerHomePhoneNotIn(List<String> values) {
            addCriterion("trainer_home_phone not in", values, "trainerHomePhone");
            return (Criteria) this;
        }

        public Criteria andTrainerHomePhoneBetween(String value1, String value2) {
            addCriterion("trainer_home_phone between", value1, value2, "trainerHomePhone");
            return (Criteria) this;
        }

        public Criteria andTrainerHomePhoneNotBetween(String value1, String value2) {
            addCriterion("trainer_home_phone not between", value1, value2, "trainerHomePhone");
            return (Criteria) this;
        }

        public Criteria andTrainerQqIsNull() {
            addCriterion("trainer_qq is null");
            return (Criteria) this;
        }

        public Criteria andTrainerQqIsNotNull() {
            addCriterion("trainer_qq is not null");
            return (Criteria) this;
        }

        public Criteria andTrainerQqEqualTo(String value) {
            addCriterion("trainer_qq =", value, "trainerQq");
            return (Criteria) this;
        }

        public Criteria andTrainerQqNotEqualTo(String value) {
            addCriterion("trainer_qq <>", value, "trainerQq");
            return (Criteria) this;
        }

        public Criteria andTrainerQqGreaterThan(String value) {
            addCriterion("trainer_qq >", value, "trainerQq");
            return (Criteria) this;
        }

        public Criteria andTrainerQqGreaterThanOrEqualTo(String value) {
            addCriterion("trainer_qq >=", value, "trainerQq");
            return (Criteria) this;
        }

        public Criteria andTrainerQqLessThan(String value) {
            addCriterion("trainer_qq <", value, "trainerQq");
            return (Criteria) this;
        }

        public Criteria andTrainerQqLessThanOrEqualTo(String value) {
            addCriterion("trainer_qq <=", value, "trainerQq");
            return (Criteria) this;
        }

        public Criteria andTrainerQqLike(String value) {
            addCriterion("trainer_qq like", value, "trainerQq");
            return (Criteria) this;
        }

        public Criteria andTrainerQqNotLike(String value) {
            addCriterion("trainer_qq not like", value, "trainerQq");
            return (Criteria) this;
        }

        public Criteria andTrainerQqIn(List<String> values) {
            addCriterion("trainer_qq in", values, "trainerQq");
            return (Criteria) this;
        }

        public Criteria andTrainerQqNotIn(List<String> values) {
            addCriterion("trainer_qq not in", values, "trainerQq");
            return (Criteria) this;
        }

        public Criteria andTrainerQqBetween(String value1, String value2) {
            addCriterion("trainer_qq between", value1, value2, "trainerQq");
            return (Criteria) this;
        }

        public Criteria andTrainerQqNotBetween(String value1, String value2) {
            addCriterion("trainer_qq not between", value1, value2, "trainerQq");
            return (Criteria) this;
        }

        public Criteria andTrainerWeixinIsNull() {
            addCriterion("trainer_weixin is null");
            return (Criteria) this;
        }

        public Criteria andTrainerWeixinIsNotNull() {
            addCriterion("trainer_weixin is not null");
            return (Criteria) this;
        }

        public Criteria andTrainerWeixinEqualTo(String value) {
            addCriterion("trainer_weixin =", value, "trainerWeixin");
            return (Criteria) this;
        }

        public Criteria andTrainerWeixinNotEqualTo(String value) {
            addCriterion("trainer_weixin <>", value, "trainerWeixin");
            return (Criteria) this;
        }

        public Criteria andTrainerWeixinGreaterThan(String value) {
            addCriterion("trainer_weixin >", value, "trainerWeixin");
            return (Criteria) this;
        }

        public Criteria andTrainerWeixinGreaterThanOrEqualTo(String value) {
            addCriterion("trainer_weixin >=", value, "trainerWeixin");
            return (Criteria) this;
        }

        public Criteria andTrainerWeixinLessThan(String value) {
            addCriterion("trainer_weixin <", value, "trainerWeixin");
            return (Criteria) this;
        }

        public Criteria andTrainerWeixinLessThanOrEqualTo(String value) {
            addCriterion("trainer_weixin <=", value, "trainerWeixin");
            return (Criteria) this;
        }

        public Criteria andTrainerWeixinLike(String value) {
            addCriterion("trainer_weixin like", value, "trainerWeixin");
            return (Criteria) this;
        }

        public Criteria andTrainerWeixinNotLike(String value) {
            addCriterion("trainer_weixin not like", value, "trainerWeixin");
            return (Criteria) this;
        }

        public Criteria andTrainerWeixinIn(List<String> values) {
            addCriterion("trainer_weixin in", values, "trainerWeixin");
            return (Criteria) this;
        }

        public Criteria andTrainerWeixinNotIn(List<String> values) {
            addCriterion("trainer_weixin not in", values, "trainerWeixin");
            return (Criteria) this;
        }

        public Criteria andTrainerWeixinBetween(String value1, String value2) {
            addCriterion("trainer_weixin between", value1, value2, "trainerWeixin");
            return (Criteria) this;
        }

        public Criteria andTrainerWeixinNotBetween(String value1, String value2) {
            addCriterion("trainer_weixin not between", value1, value2, "trainerWeixin");
            return (Criteria) this;
        }

        public Criteria andTrainerAddressIsNull() {
            addCriterion("trainer_address is null");
            return (Criteria) this;
        }

        public Criteria andTrainerAddressIsNotNull() {
            addCriterion("trainer_address is not null");
            return (Criteria) this;
        }

        public Criteria andTrainerAddressEqualTo(String value) {
            addCriterion("trainer_address =", value, "trainerAddress");
            return (Criteria) this;
        }

        public Criteria andTrainerAddressNotEqualTo(String value) {
            addCriterion("trainer_address <>", value, "trainerAddress");
            return (Criteria) this;
        }

        public Criteria andTrainerAddressGreaterThan(String value) {
            addCriterion("trainer_address >", value, "trainerAddress");
            return (Criteria) this;
        }

        public Criteria andTrainerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("trainer_address >=", value, "trainerAddress");
            return (Criteria) this;
        }

        public Criteria andTrainerAddressLessThan(String value) {
            addCriterion("trainer_address <", value, "trainerAddress");
            return (Criteria) this;
        }

        public Criteria andTrainerAddressLessThanOrEqualTo(String value) {
            addCriterion("trainer_address <=", value, "trainerAddress");
            return (Criteria) this;
        }

        public Criteria andTrainerAddressLike(String value) {
            addCriterion("trainer_address like", value, "trainerAddress");
            return (Criteria) this;
        }

        public Criteria andTrainerAddressNotLike(String value) {
            addCriterion("trainer_address not like", value, "trainerAddress");
            return (Criteria) this;
        }

        public Criteria andTrainerAddressIn(List<String> values) {
            addCriterion("trainer_address in", values, "trainerAddress");
            return (Criteria) this;
        }

        public Criteria andTrainerAddressNotIn(List<String> values) {
            addCriterion("trainer_address not in", values, "trainerAddress");
            return (Criteria) this;
        }

        public Criteria andTrainerAddressBetween(String value1, String value2) {
            addCriterion("trainer_address between", value1, value2, "trainerAddress");
            return (Criteria) this;
        }

        public Criteria andTrainerAddressNotBetween(String value1, String value2) {
            addCriterion("trainer_address not between", value1, value2, "trainerAddress");
            return (Criteria) this;
        }

        public Criteria andTrainerNoteIsNull() {
            addCriterion("trainer_note is null");
            return (Criteria) this;
        }

        public Criteria andTrainerNoteIsNotNull() {
            addCriterion("trainer_note is not null");
            return (Criteria) this;
        }

        public Criteria andTrainerNoteEqualTo(String value) {
            addCriterion("trainer_note =", value, "trainerNote");
            return (Criteria) this;
        }

        public Criteria andTrainerNoteNotEqualTo(String value) {
            addCriterion("trainer_note <>", value, "trainerNote");
            return (Criteria) this;
        }

        public Criteria andTrainerNoteGreaterThan(String value) {
            addCriterion("trainer_note >", value, "trainerNote");
            return (Criteria) this;
        }

        public Criteria andTrainerNoteGreaterThanOrEqualTo(String value) {
            addCriterion("trainer_note >=", value, "trainerNote");
            return (Criteria) this;
        }

        public Criteria andTrainerNoteLessThan(String value) {
            addCriterion("trainer_note <", value, "trainerNote");
            return (Criteria) this;
        }

        public Criteria andTrainerNoteLessThanOrEqualTo(String value) {
            addCriterion("trainer_note <=", value, "trainerNote");
            return (Criteria) this;
        }

        public Criteria andTrainerNoteLike(String value) {
            addCriterion("trainer_note like", value, "trainerNote");
            return (Criteria) this;
        }

        public Criteria andTrainerNoteNotLike(String value) {
            addCriterion("trainer_note not like", value, "trainerNote");
            return (Criteria) this;
        }

        public Criteria andTrainerNoteIn(List<String> values) {
            addCriterion("trainer_note in", values, "trainerNote");
            return (Criteria) this;
        }

        public Criteria andTrainerNoteNotIn(List<String> values) {
            addCriterion("trainer_note not in", values, "trainerNote");
            return (Criteria) this;
        }

        public Criteria andTrainerNoteBetween(String value1, String value2) {
            addCriterion("trainer_note between", value1, value2, "trainerNote");
            return (Criteria) this;
        }

        public Criteria andTrainerNoteNotBetween(String value1, String value2) {
            addCriterion("trainer_note not between", value1, value2, "trainerNote");
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