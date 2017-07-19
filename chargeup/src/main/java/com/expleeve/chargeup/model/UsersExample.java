package com.expleeve.chargeup.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
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

        public Criteria andDisplaynameIsNull() {
            addCriterion("displayname is null");
            return (Criteria) this;
        }

        public Criteria andDisplaynameIsNotNull() {
            addCriterion("displayname is not null");
            return (Criteria) this;
        }

        public Criteria andDisplaynameEqualTo(String value) {
            addCriterion("displayname =", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameNotEqualTo(String value) {
            addCriterion("displayname <>", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameGreaterThan(String value) {
            addCriterion("displayname >", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameGreaterThanOrEqualTo(String value) {
            addCriterion("displayname >=", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameLessThan(String value) {
            addCriterion("displayname <", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameLessThanOrEqualTo(String value) {
            addCriterion("displayname <=", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameLike(String value) {
            addCriterion("displayname like", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameNotLike(String value) {
            addCriterion("displayname not like", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameIn(List<String> values) {
            addCriterion("displayname in", values, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameNotIn(List<String> values) {
            addCriterion("displayname not in", values, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameBetween(String value1, String value2) {
            addCriterion("displayname between", value1, value2, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameNotBetween(String value1, String value2) {
            addCriterion("displayname not between", value1, value2, "displayname");
            return (Criteria) this;
        }

        public Criteria andDesc4userIsNull() {
            addCriterion("desc4user is null");
            return (Criteria) this;
        }

        public Criteria andDesc4userIsNotNull() {
            addCriterion("desc4user is not null");
            return (Criteria) this;
        }

        public Criteria andDesc4userEqualTo(String value) {
            addCriterion("desc4user =", value, "desc4user");
            return (Criteria) this;
        }

        public Criteria andDesc4userNotEqualTo(String value) {
            addCriterion("desc4user <>", value, "desc4user");
            return (Criteria) this;
        }

        public Criteria andDesc4userGreaterThan(String value) {
            addCriterion("desc4user >", value, "desc4user");
            return (Criteria) this;
        }

        public Criteria andDesc4userGreaterThanOrEqualTo(String value) {
            addCriterion("desc4user >=", value, "desc4user");
            return (Criteria) this;
        }

        public Criteria andDesc4userLessThan(String value) {
            addCriterion("desc4user <", value, "desc4user");
            return (Criteria) this;
        }

        public Criteria andDesc4userLessThanOrEqualTo(String value) {
            addCriterion("desc4user <=", value, "desc4user");
            return (Criteria) this;
        }

        public Criteria andDesc4userLike(String value) {
            addCriterion("desc4user like", value, "desc4user");
            return (Criteria) this;
        }

        public Criteria andDesc4userNotLike(String value) {
            addCriterion("desc4user not like", value, "desc4user");
            return (Criteria) this;
        }

        public Criteria andDesc4userIn(List<String> values) {
            addCriterion("desc4user in", values, "desc4user");
            return (Criteria) this;
        }

        public Criteria andDesc4userNotIn(List<String> values) {
            addCriterion("desc4user not in", values, "desc4user");
            return (Criteria) this;
        }

        public Criteria andDesc4userBetween(String value1, String value2) {
            addCriterion("desc4user between", value1, value2, "desc4user");
            return (Criteria) this;
        }

        public Criteria andDesc4userNotBetween(String value1, String value2) {
            addCriterion("desc4user not between", value1, value2, "desc4user");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNull() {
            addCriterion("insert_time is null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNotNull() {
            addCriterion("insert_time is not null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeEqualTo(Date value) {
            addCriterion("insert_time =", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotEqualTo(Date value) {
            addCriterion("insert_time <>", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThan(Date value) {
            addCriterion("insert_time >", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("insert_time >=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThan(Date value) {
            addCriterion("insert_time <", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThanOrEqualTo(Date value) {
            addCriterion("insert_time <=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIn(List<Date> values) {
            addCriterion("insert_time in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotIn(List<Date> values) {
            addCriterion("insert_time not in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeBetween(Date value1, Date value2) {
            addCriterion("insert_time between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotBetween(Date value1, Date value2) {
            addCriterion("insert_time not between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andIsLoginIsNull() {
            addCriterion("is_login is null");
            return (Criteria) this;
        }

        public Criteria andIsLoginIsNotNull() {
            addCriterion("is_login is not null");
            return (Criteria) this;
        }

        public Criteria andIsLoginEqualTo(Boolean value) {
            addCriterion("is_login =", value, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginNotEqualTo(Boolean value) {
            addCriterion("is_login <>", value, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginGreaterThan(Boolean value) {
            addCriterion("is_login >", value, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_login >=", value, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginLessThan(Boolean value) {
            addCriterion("is_login <", value, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginLessThanOrEqualTo(Boolean value) {
            addCriterion("is_login <=", value, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginIn(List<Boolean> values) {
            addCriterion("is_login in", values, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginNotIn(List<Boolean> values) {
            addCriterion("is_login not in", values, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginBetween(Boolean value1, Boolean value2) {
            addCriterion("is_login between", value1, value2, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsLoginNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_login not between", value1, value2, "isLogin");
            return (Criteria) this;
        }

        public Criteria andIsvalidIsNull() {
            addCriterion("isvalid is null");
            return (Criteria) this;
        }

        public Criteria andIsvalidIsNotNull() {
            addCriterion("isvalid is not null");
            return (Criteria) this;
        }

        public Criteria andIsvalidEqualTo(Boolean value) {
            addCriterion("isvalid =", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotEqualTo(Boolean value) {
            addCriterion("isvalid <>", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidGreaterThan(Boolean value) {
            addCriterion("isvalid >", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isvalid >=", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidLessThan(Boolean value) {
            addCriterion("isvalid <", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidLessThanOrEqualTo(Boolean value) {
            addCriterion("isvalid <=", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidIn(List<Boolean> values) {
            addCriterion("isvalid in", values, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotIn(List<Boolean> values) {
            addCriterion("isvalid not in", values, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidBetween(Boolean value1, Boolean value2) {
            addCriterion("isvalid between", value1, value2, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isvalid not between", value1, value2, "isvalid");
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