package cn.codingstar.chero.model.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberExample() {
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

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberNicknameIsNull() {
            addCriterion("member_nickname is null");
            return (Criteria) this;
        }

        public Criteria andMemberNicknameIsNotNull() {
            addCriterion("member_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNicknameEqualTo(String value) {
            addCriterion("member_nickname =", value, "memberNickname");
            return (Criteria) this;
        }

        public Criteria andMemberNicknameNotEqualTo(String value) {
            addCriterion("member_nickname <>", value, "memberNickname");
            return (Criteria) this;
        }

        public Criteria andMemberNicknameGreaterThan(String value) {
            addCriterion("member_nickname >", value, "memberNickname");
            return (Criteria) this;
        }

        public Criteria andMemberNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("member_nickname >=", value, "memberNickname");
            return (Criteria) this;
        }

        public Criteria andMemberNicknameLessThan(String value) {
            addCriterion("member_nickname <", value, "memberNickname");
            return (Criteria) this;
        }

        public Criteria andMemberNicknameLessThanOrEqualTo(String value) {
            addCriterion("member_nickname <=", value, "memberNickname");
            return (Criteria) this;
        }

        public Criteria andMemberNicknameLike(String value) {
            addCriterion("member_nickname like", value, "memberNickname");
            return (Criteria) this;
        }

        public Criteria andMemberNicknameNotLike(String value) {
            addCriterion("member_nickname not like", value, "memberNickname");
            return (Criteria) this;
        }

        public Criteria andMemberNicknameIn(List<String> values) {
            addCriterion("member_nickname in", values, "memberNickname");
            return (Criteria) this;
        }

        public Criteria andMemberNicknameNotIn(List<String> values) {
            addCriterion("member_nickname not in", values, "memberNickname");
            return (Criteria) this;
        }

        public Criteria andMemberNicknameBetween(String value1, String value2) {
            addCriterion("member_nickname between", value1, value2, "memberNickname");
            return (Criteria) this;
        }

        public Criteria andMemberNicknameNotBetween(String value1, String value2) {
            addCriterion("member_nickname not between", value1, value2, "memberNickname");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNull() {
            addCriterion("member_name is null");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNotNull() {
            addCriterion("member_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNameEqualTo(String value) {
            addCriterion("member_name =", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotEqualTo(String value) {
            addCriterion("member_name <>", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThan(String value) {
            addCriterion("member_name >", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThanOrEqualTo(String value) {
            addCriterion("member_name >=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThan(String value) {
            addCriterion("member_name <", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThanOrEqualTo(String value) {
            addCriterion("member_name <=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLike(String value) {
            addCriterion("member_name like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotLike(String value) {
            addCriterion("member_name not like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameIn(List<String> values) {
            addCriterion("member_name in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotIn(List<String> values) {
            addCriterion("member_name not in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameBetween(String value1, String value2) {
            addCriterion("member_name between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotBetween(String value1, String value2) {
            addCriterion("member_name not between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltIsNull() {
            addCriterion("password_salt is null");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltIsNotNull() {
            addCriterion("password_salt is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltEqualTo(String value) {
            addCriterion("password_salt =", value, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltNotEqualTo(String value) {
            addCriterion("password_salt <>", value, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltGreaterThan(String value) {
            addCriterion("password_salt >", value, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltGreaterThanOrEqualTo(String value) {
            addCriterion("password_salt >=", value, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltLessThan(String value) {
            addCriterion("password_salt <", value, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltLessThanOrEqualTo(String value) {
            addCriterion("password_salt <=", value, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltLike(String value) {
            addCriterion("password_salt like", value, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltNotLike(String value) {
            addCriterion("password_salt not like", value, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltIn(List<String> values) {
            addCriterion("password_salt in", values, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltNotIn(List<String> values) {
            addCriterion("password_salt not in", values, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltBetween(String value1, String value2) {
            addCriterion("password_salt between", value1, value2, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andPasswordSaltNotBetween(String value1, String value2) {
            addCriterion("password_salt not between", value1, value2, "passwordSalt");
            return (Criteria) this;
        }

        public Criteria andEnableIsNull() {
            addCriterion("enable is null");
            return (Criteria) this;
        }

        public Criteria andEnableIsNotNull() {
            addCriterion("enable is not null");
            return (Criteria) this;
        }

        public Criteria andEnableEqualTo(Boolean value) {
            addCriterion("enable =", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotEqualTo(Boolean value) {
            addCriterion("enable <>", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThan(Boolean value) {
            addCriterion("enable >", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("enable >=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThan(Boolean value) {
            addCriterion("enable <", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThanOrEqualTo(Boolean value) {
            addCriterion("enable <=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableIn(List<Boolean> values) {
            addCriterion("enable in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotIn(List<Boolean> values) {
            addCriterion("enable not in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableBetween(Boolean value1, Boolean value2) {
            addCriterion("enable between", value1, value2, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("enable not between", value1, value2, "enable");
            return (Criteria) this;
        }

        public Criteria andMemberImageIsNull() {
            addCriterion("member_image is null");
            return (Criteria) this;
        }

        public Criteria andMemberImageIsNotNull() {
            addCriterion("member_image is not null");
            return (Criteria) this;
        }

        public Criteria andMemberImageEqualTo(String value) {
            addCriterion("member_image =", value, "memberImage");
            return (Criteria) this;
        }

        public Criteria andMemberImageNotEqualTo(String value) {
            addCriterion("member_image <>", value, "memberImage");
            return (Criteria) this;
        }

        public Criteria andMemberImageGreaterThan(String value) {
            addCriterion("member_image >", value, "memberImage");
            return (Criteria) this;
        }

        public Criteria andMemberImageGreaterThanOrEqualTo(String value) {
            addCriterion("member_image >=", value, "memberImage");
            return (Criteria) this;
        }

        public Criteria andMemberImageLessThan(String value) {
            addCriterion("member_image <", value, "memberImage");
            return (Criteria) this;
        }

        public Criteria andMemberImageLessThanOrEqualTo(String value) {
            addCriterion("member_image <=", value, "memberImage");
            return (Criteria) this;
        }

        public Criteria andMemberImageLike(String value) {
            addCriterion("member_image like", value, "memberImage");
            return (Criteria) this;
        }

        public Criteria andMemberImageNotLike(String value) {
            addCriterion("member_image not like", value, "memberImage");
            return (Criteria) this;
        }

        public Criteria andMemberImageIn(List<String> values) {
            addCriterion("member_image in", values, "memberImage");
            return (Criteria) this;
        }

        public Criteria andMemberImageNotIn(List<String> values) {
            addCriterion("member_image not in", values, "memberImage");
            return (Criteria) this;
        }

        public Criteria andMemberImageBetween(String value1, String value2) {
            addCriterion("member_image between", value1, value2, "memberImage");
            return (Criteria) this;
        }

        public Criteria andMemberImageNotBetween(String value1, String value2) {
            addCriterion("member_image not between", value1, value2, "memberImage");
            return (Criteria) this;
        }

        public Criteria andMemberSexIsNull() {
            addCriterion("member_sex is null");
            return (Criteria) this;
        }

        public Criteria andMemberSexIsNotNull() {
            addCriterion("member_sex is not null");
            return (Criteria) this;
        }

        public Criteria andMemberSexEqualTo(String value) {
            addCriterion("member_sex =", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexNotEqualTo(String value) {
            addCriterion("member_sex <>", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexGreaterThan(String value) {
            addCriterion("member_sex >", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexGreaterThanOrEqualTo(String value) {
            addCriterion("member_sex >=", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexLessThan(String value) {
            addCriterion("member_sex <", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexLessThanOrEqualTo(String value) {
            addCriterion("member_sex <=", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexLike(String value) {
            addCriterion("member_sex like", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexNotLike(String value) {
            addCriterion("member_sex not like", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexIn(List<String> values) {
            addCriterion("member_sex in", values, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexNotIn(List<String> values) {
            addCriterion("member_sex not in", values, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexBetween(String value1, String value2) {
            addCriterion("member_sex between", value1, value2, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexNotBetween(String value1, String value2) {
            addCriterion("member_sex not between", value1, value2, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayIsNull() {
            addCriterion("member_birthday is null");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayIsNotNull() {
            addCriterion("member_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("member_birthday =", value, "memberBirthday");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("member_birthday <>", value, "memberBirthday");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("member_birthday >", value, "memberBirthday");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("member_birthday >=", value, "memberBirthday");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("member_birthday <", value, "memberBirthday");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("member_birthday <=", value, "memberBirthday");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("member_birthday in", values, "memberBirthday");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("member_birthday not in", values, "memberBirthday");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("member_birthday between", value1, value2, "memberBirthday");
            return (Criteria) this;
        }

        public Criteria andMemberBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("member_birthday not between", value1, value2, "memberBirthday");
            return (Criteria) this;
        }

        public Criteria andMemberHobbyIsNull() {
            addCriterion("member_hobby is null");
            return (Criteria) this;
        }

        public Criteria andMemberHobbyIsNotNull() {
            addCriterion("member_hobby is not null");
            return (Criteria) this;
        }

        public Criteria andMemberHobbyEqualTo(String value) {
            addCriterion("member_hobby =", value, "memberHobby");
            return (Criteria) this;
        }

        public Criteria andMemberHobbyNotEqualTo(String value) {
            addCriterion("member_hobby <>", value, "memberHobby");
            return (Criteria) this;
        }

        public Criteria andMemberHobbyGreaterThan(String value) {
            addCriterion("member_hobby >", value, "memberHobby");
            return (Criteria) this;
        }

        public Criteria andMemberHobbyGreaterThanOrEqualTo(String value) {
            addCriterion("member_hobby >=", value, "memberHobby");
            return (Criteria) this;
        }

        public Criteria andMemberHobbyLessThan(String value) {
            addCriterion("member_hobby <", value, "memberHobby");
            return (Criteria) this;
        }

        public Criteria andMemberHobbyLessThanOrEqualTo(String value) {
            addCriterion("member_hobby <=", value, "memberHobby");
            return (Criteria) this;
        }

        public Criteria andMemberHobbyLike(String value) {
            addCriterion("member_hobby like", value, "memberHobby");
            return (Criteria) this;
        }

        public Criteria andMemberHobbyNotLike(String value) {
            addCriterion("member_hobby not like", value, "memberHobby");
            return (Criteria) this;
        }

        public Criteria andMemberHobbyIn(List<String> values) {
            addCriterion("member_hobby in", values, "memberHobby");
            return (Criteria) this;
        }

        public Criteria andMemberHobbyNotIn(List<String> values) {
            addCriterion("member_hobby not in", values, "memberHobby");
            return (Criteria) this;
        }

        public Criteria andMemberHobbyBetween(String value1, String value2) {
            addCriterion("member_hobby between", value1, value2, "memberHobby");
            return (Criteria) this;
        }

        public Criteria andMemberHobbyNotBetween(String value1, String value2) {
            addCriterion("member_hobby not between", value1, value2, "memberHobby");
            return (Criteria) this;
        }

        public Criteria andMemberTelephoneIsNull() {
            addCriterion("member_telephone is null");
            return (Criteria) this;
        }

        public Criteria andMemberTelephoneIsNotNull() {
            addCriterion("member_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andMemberTelephoneEqualTo(String value) {
            addCriterion("member_telephone =", value, "memberTelephone");
            return (Criteria) this;
        }

        public Criteria andMemberTelephoneNotEqualTo(String value) {
            addCriterion("member_telephone <>", value, "memberTelephone");
            return (Criteria) this;
        }

        public Criteria andMemberTelephoneGreaterThan(String value) {
            addCriterion("member_telephone >", value, "memberTelephone");
            return (Criteria) this;
        }

        public Criteria andMemberTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("member_telephone >=", value, "memberTelephone");
            return (Criteria) this;
        }

        public Criteria andMemberTelephoneLessThan(String value) {
            addCriterion("member_telephone <", value, "memberTelephone");
            return (Criteria) this;
        }

        public Criteria andMemberTelephoneLessThanOrEqualTo(String value) {
            addCriterion("member_telephone <=", value, "memberTelephone");
            return (Criteria) this;
        }

        public Criteria andMemberTelephoneLike(String value) {
            addCriterion("member_telephone like", value, "memberTelephone");
            return (Criteria) this;
        }

        public Criteria andMemberTelephoneNotLike(String value) {
            addCriterion("member_telephone not like", value, "memberTelephone");
            return (Criteria) this;
        }

        public Criteria andMemberTelephoneIn(List<String> values) {
            addCriterion("member_telephone in", values, "memberTelephone");
            return (Criteria) this;
        }

        public Criteria andMemberTelephoneNotIn(List<String> values) {
            addCriterion("member_telephone not in", values, "memberTelephone");
            return (Criteria) this;
        }

        public Criteria andMemberTelephoneBetween(String value1, String value2) {
            addCriterion("member_telephone between", value1, value2, "memberTelephone");
            return (Criteria) this;
        }

        public Criteria andMemberTelephoneNotBetween(String value1, String value2) {
            addCriterion("member_telephone not between", value1, value2, "memberTelephone");
            return (Criteria) this;
        }

        public Criteria andMemberHomePhoneIsNull() {
            addCriterion("member_home_phone is null");
            return (Criteria) this;
        }

        public Criteria andMemberHomePhoneIsNotNull() {
            addCriterion("member_home_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMemberHomePhoneEqualTo(String value) {
            addCriterion("member_home_phone =", value, "memberHomePhone");
            return (Criteria) this;
        }

        public Criteria andMemberHomePhoneNotEqualTo(String value) {
            addCriterion("member_home_phone <>", value, "memberHomePhone");
            return (Criteria) this;
        }

        public Criteria andMemberHomePhoneGreaterThan(String value) {
            addCriterion("member_home_phone >", value, "memberHomePhone");
            return (Criteria) this;
        }

        public Criteria andMemberHomePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("member_home_phone >=", value, "memberHomePhone");
            return (Criteria) this;
        }

        public Criteria andMemberHomePhoneLessThan(String value) {
            addCriterion("member_home_phone <", value, "memberHomePhone");
            return (Criteria) this;
        }

        public Criteria andMemberHomePhoneLessThanOrEqualTo(String value) {
            addCriterion("member_home_phone <=", value, "memberHomePhone");
            return (Criteria) this;
        }

        public Criteria andMemberHomePhoneLike(String value) {
            addCriterion("member_home_phone like", value, "memberHomePhone");
            return (Criteria) this;
        }

        public Criteria andMemberHomePhoneNotLike(String value) {
            addCriterion("member_home_phone not like", value, "memberHomePhone");
            return (Criteria) this;
        }

        public Criteria andMemberHomePhoneIn(List<String> values) {
            addCriterion("member_home_phone in", values, "memberHomePhone");
            return (Criteria) this;
        }

        public Criteria andMemberHomePhoneNotIn(List<String> values) {
            addCriterion("member_home_phone not in", values, "memberHomePhone");
            return (Criteria) this;
        }

        public Criteria andMemberHomePhoneBetween(String value1, String value2) {
            addCriterion("member_home_phone between", value1, value2, "memberHomePhone");
            return (Criteria) this;
        }

        public Criteria andMemberHomePhoneNotBetween(String value1, String value2) {
            addCriterion("member_home_phone not between", value1, value2, "memberHomePhone");
            return (Criteria) this;
        }

        public Criteria andMemberQqIsNull() {
            addCriterion("member_qq is null");
            return (Criteria) this;
        }

        public Criteria andMemberQqIsNotNull() {
            addCriterion("member_qq is not null");
            return (Criteria) this;
        }

        public Criteria andMemberQqEqualTo(String value) {
            addCriterion("member_qq =", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqNotEqualTo(String value) {
            addCriterion("member_qq <>", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqGreaterThan(String value) {
            addCriterion("member_qq >", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqGreaterThanOrEqualTo(String value) {
            addCriterion("member_qq >=", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqLessThan(String value) {
            addCriterion("member_qq <", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqLessThanOrEqualTo(String value) {
            addCriterion("member_qq <=", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqLike(String value) {
            addCriterion("member_qq like", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqNotLike(String value) {
            addCriterion("member_qq not like", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqIn(List<String> values) {
            addCriterion("member_qq in", values, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqNotIn(List<String> values) {
            addCriterion("member_qq not in", values, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqBetween(String value1, String value2) {
            addCriterion("member_qq between", value1, value2, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqNotBetween(String value1, String value2) {
            addCriterion("member_qq not between", value1, value2, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberWeixinIsNull() {
            addCriterion("member_weixin is null");
            return (Criteria) this;
        }

        public Criteria andMemberWeixinIsNotNull() {
            addCriterion("member_weixin is not null");
            return (Criteria) this;
        }

        public Criteria andMemberWeixinEqualTo(String value) {
            addCriterion("member_weixin =", value, "memberWeixin");
            return (Criteria) this;
        }

        public Criteria andMemberWeixinNotEqualTo(String value) {
            addCriterion("member_weixin <>", value, "memberWeixin");
            return (Criteria) this;
        }

        public Criteria andMemberWeixinGreaterThan(String value) {
            addCriterion("member_weixin >", value, "memberWeixin");
            return (Criteria) this;
        }

        public Criteria andMemberWeixinGreaterThanOrEqualTo(String value) {
            addCriterion("member_weixin >=", value, "memberWeixin");
            return (Criteria) this;
        }

        public Criteria andMemberWeixinLessThan(String value) {
            addCriterion("member_weixin <", value, "memberWeixin");
            return (Criteria) this;
        }

        public Criteria andMemberWeixinLessThanOrEqualTo(String value) {
            addCriterion("member_weixin <=", value, "memberWeixin");
            return (Criteria) this;
        }

        public Criteria andMemberWeixinLike(String value) {
            addCriterion("member_weixin like", value, "memberWeixin");
            return (Criteria) this;
        }

        public Criteria andMemberWeixinNotLike(String value) {
            addCriterion("member_weixin not like", value, "memberWeixin");
            return (Criteria) this;
        }

        public Criteria andMemberWeixinIn(List<String> values) {
            addCriterion("member_weixin in", values, "memberWeixin");
            return (Criteria) this;
        }

        public Criteria andMemberWeixinNotIn(List<String> values) {
            addCriterion("member_weixin not in", values, "memberWeixin");
            return (Criteria) this;
        }

        public Criteria andMemberWeixinBetween(String value1, String value2) {
            addCriterion("member_weixin between", value1, value2, "memberWeixin");
            return (Criteria) this;
        }

        public Criteria andMemberWeixinNotBetween(String value1, String value2) {
            addCriterion("member_weixin not between", value1, value2, "memberWeixin");
            return (Criteria) this;
        }

        public Criteria andMemberAddressIsNull() {
            addCriterion("member_address is null");
            return (Criteria) this;
        }

        public Criteria andMemberAddressIsNotNull() {
            addCriterion("member_address is not null");
            return (Criteria) this;
        }

        public Criteria andMemberAddressEqualTo(String value) {
            addCriterion("member_address =", value, "memberAddress");
            return (Criteria) this;
        }

        public Criteria andMemberAddressNotEqualTo(String value) {
            addCriterion("member_address <>", value, "memberAddress");
            return (Criteria) this;
        }

        public Criteria andMemberAddressGreaterThan(String value) {
            addCriterion("member_address >", value, "memberAddress");
            return (Criteria) this;
        }

        public Criteria andMemberAddressGreaterThanOrEqualTo(String value) {
            addCriterion("member_address >=", value, "memberAddress");
            return (Criteria) this;
        }

        public Criteria andMemberAddressLessThan(String value) {
            addCriterion("member_address <", value, "memberAddress");
            return (Criteria) this;
        }

        public Criteria andMemberAddressLessThanOrEqualTo(String value) {
            addCriterion("member_address <=", value, "memberAddress");
            return (Criteria) this;
        }

        public Criteria andMemberAddressLike(String value) {
            addCriterion("member_address like", value, "memberAddress");
            return (Criteria) this;
        }

        public Criteria andMemberAddressNotLike(String value) {
            addCriterion("member_address not like", value, "memberAddress");
            return (Criteria) this;
        }

        public Criteria andMemberAddressIn(List<String> values) {
            addCriterion("member_address in", values, "memberAddress");
            return (Criteria) this;
        }

        public Criteria andMemberAddressNotIn(List<String> values) {
            addCriterion("member_address not in", values, "memberAddress");
            return (Criteria) this;
        }

        public Criteria andMemberAddressBetween(String value1, String value2) {
            addCriterion("member_address between", value1, value2, "memberAddress");
            return (Criteria) this;
        }

        public Criteria andMemberAddressNotBetween(String value1, String value2) {
            addCriterion("member_address not between", value1, value2, "memberAddress");
            return (Criteria) this;
        }

        public Criteria andMemberNoteIsNull() {
            addCriterion("member_note is null");
            return (Criteria) this;
        }

        public Criteria andMemberNoteIsNotNull() {
            addCriterion("member_note is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNoteEqualTo(String value) {
            addCriterion("member_note =", value, "memberNote");
            return (Criteria) this;
        }

        public Criteria andMemberNoteNotEqualTo(String value) {
            addCriterion("member_note <>", value, "memberNote");
            return (Criteria) this;
        }

        public Criteria andMemberNoteGreaterThan(String value) {
            addCriterion("member_note >", value, "memberNote");
            return (Criteria) this;
        }

        public Criteria andMemberNoteGreaterThanOrEqualTo(String value) {
            addCriterion("member_note >=", value, "memberNote");
            return (Criteria) this;
        }

        public Criteria andMemberNoteLessThan(String value) {
            addCriterion("member_note <", value, "memberNote");
            return (Criteria) this;
        }

        public Criteria andMemberNoteLessThanOrEqualTo(String value) {
            addCriterion("member_note <=", value, "memberNote");
            return (Criteria) this;
        }

        public Criteria andMemberNoteLike(String value) {
            addCriterion("member_note like", value, "memberNote");
            return (Criteria) this;
        }

        public Criteria andMemberNoteNotLike(String value) {
            addCriterion("member_note not like", value, "memberNote");
            return (Criteria) this;
        }

        public Criteria andMemberNoteIn(List<String> values) {
            addCriterion("member_note in", values, "memberNote");
            return (Criteria) this;
        }

        public Criteria andMemberNoteNotIn(List<String> values) {
            addCriterion("member_note not in", values, "memberNote");
            return (Criteria) this;
        }

        public Criteria andMemberNoteBetween(String value1, String value2) {
            addCriterion("member_note between", value1, value2, "memberNote");
            return (Criteria) this;
        }

        public Criteria andMemberNoteNotBetween(String value1, String value2) {
            addCriterion("member_note not between", value1, value2, "memberNote");
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