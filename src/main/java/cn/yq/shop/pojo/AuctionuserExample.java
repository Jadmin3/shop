package cn.yq.shop.pojo;

import java.util.ArrayList;
import java.util.List;

public class AuctionuserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuctionuserExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIsNull() {
            addCriterion("userPassword is null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIsNotNull() {
            addCriterion("userPassword is not null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordEqualTo(String value) {
            addCriterion("userPassword =", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotEqualTo(String value) {
            addCriterion("userPassword <>", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThan(String value) {
            addCriterion("userPassword >", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("userPassword >=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThan(String value) {
            addCriterion("userPassword <", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThanOrEqualTo(String value) {
            addCriterion("userPassword <=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLike(String value) {
            addCriterion("userPassword like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotLike(String value) {
            addCriterion("userPassword not like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIn(List<String> values) {
            addCriterion("userPassword in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotIn(List<String> values) {
            addCriterion("userPassword not in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordBetween(String value1, String value2) {
            addCriterion("userPassword between", value1, value2, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotBetween(String value1, String value2) {
            addCriterion("userPassword not between", value1, value2, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUsercardnoIsNull() {
            addCriterion("userCardNo is null");
            return (Criteria) this;
        }

        public Criteria andUsercardnoIsNotNull() {
            addCriterion("userCardNo is not null");
            return (Criteria) this;
        }

        public Criteria andUsercardnoEqualTo(String value) {
            addCriterion("userCardNo =", value, "usercardno");
            return (Criteria) this;
        }

        public Criteria andUsercardnoNotEqualTo(String value) {
            addCriterion("userCardNo <>", value, "usercardno");
            return (Criteria) this;
        }

        public Criteria andUsercardnoGreaterThan(String value) {
            addCriterion("userCardNo >", value, "usercardno");
            return (Criteria) this;
        }

        public Criteria andUsercardnoGreaterThanOrEqualTo(String value) {
            addCriterion("userCardNo >=", value, "usercardno");
            return (Criteria) this;
        }

        public Criteria andUsercardnoLessThan(String value) {
            addCriterion("userCardNo <", value, "usercardno");
            return (Criteria) this;
        }

        public Criteria andUsercardnoLessThanOrEqualTo(String value) {
            addCriterion("userCardNo <=", value, "usercardno");
            return (Criteria) this;
        }

        public Criteria andUsercardnoLike(String value) {
            addCriterion("userCardNo like", value, "usercardno");
            return (Criteria) this;
        }

        public Criteria andUsercardnoNotLike(String value) {
            addCriterion("userCardNo not like", value, "usercardno");
            return (Criteria) this;
        }

        public Criteria andUsercardnoIn(List<String> values) {
            addCriterion("userCardNo in", values, "usercardno");
            return (Criteria) this;
        }

        public Criteria andUsercardnoNotIn(List<String> values) {
            addCriterion("userCardNo not in", values, "usercardno");
            return (Criteria) this;
        }

        public Criteria andUsercardnoBetween(String value1, String value2) {
            addCriterion("userCardNo between", value1, value2, "usercardno");
            return (Criteria) this;
        }

        public Criteria andUsercardnoNotBetween(String value1, String value2) {
            addCriterion("userCardNo not between", value1, value2, "usercardno");
            return (Criteria) this;
        }

        public Criteria andUsertelIsNull() {
            addCriterion("userTel is null");
            return (Criteria) this;
        }

        public Criteria andUsertelIsNotNull() {
            addCriterion("userTel is not null");
            return (Criteria) this;
        }

        public Criteria andUsertelEqualTo(String value) {
            addCriterion("userTel =", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelNotEqualTo(String value) {
            addCriterion("userTel <>", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelGreaterThan(String value) {
            addCriterion("userTel >", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelGreaterThanOrEqualTo(String value) {
            addCriterion("userTel >=", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelLessThan(String value) {
            addCriterion("userTel <", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelLessThanOrEqualTo(String value) {
            addCriterion("userTel <=", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelLike(String value) {
            addCriterion("userTel like", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelNotLike(String value) {
            addCriterion("userTel not like", value, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelIn(List<String> values) {
            addCriterion("userTel in", values, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelNotIn(List<String> values) {
            addCriterion("userTel not in", values, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelBetween(String value1, String value2) {
            addCriterion("userTel between", value1, value2, "usertel");
            return (Criteria) this;
        }

        public Criteria andUsertelNotBetween(String value1, String value2) {
            addCriterion("userTel not between", value1, value2, "usertel");
            return (Criteria) this;
        }

        public Criteria andUseraddressIsNull() {
            addCriterion("userAddress is null");
            return (Criteria) this;
        }

        public Criteria andUseraddressIsNotNull() {
            addCriterion("userAddress is not null");
            return (Criteria) this;
        }

        public Criteria andUseraddressEqualTo(String value) {
            addCriterion("userAddress =", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressNotEqualTo(String value) {
            addCriterion("userAddress <>", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressGreaterThan(String value) {
            addCriterion("userAddress >", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressGreaterThanOrEqualTo(String value) {
            addCriterion("userAddress >=", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressLessThan(String value) {
            addCriterion("userAddress <", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressLessThanOrEqualTo(String value) {
            addCriterion("userAddress <=", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressLike(String value) {
            addCriterion("userAddress like", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressNotLike(String value) {
            addCriterion("userAddress not like", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressIn(List<String> values) {
            addCriterion("userAddress in", values, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressNotIn(List<String> values) {
            addCriterion("userAddress not in", values, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressBetween(String value1, String value2) {
            addCriterion("userAddress between", value1, value2, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressNotBetween(String value1, String value2) {
            addCriterion("userAddress not between", value1, value2, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUserpostnumberIsNull() {
            addCriterion("userPostNumber is null");
            return (Criteria) this;
        }

        public Criteria andUserpostnumberIsNotNull() {
            addCriterion("userPostNumber is not null");
            return (Criteria) this;
        }

        public Criteria andUserpostnumberEqualTo(String value) {
            addCriterion("userPostNumber =", value, "userpostnumber");
            return (Criteria) this;
        }

        public Criteria andUserpostnumberNotEqualTo(String value) {
            addCriterion("userPostNumber <>", value, "userpostnumber");
            return (Criteria) this;
        }

        public Criteria andUserpostnumberGreaterThan(String value) {
            addCriterion("userPostNumber >", value, "userpostnumber");
            return (Criteria) this;
        }

        public Criteria andUserpostnumberGreaterThanOrEqualTo(String value) {
            addCriterion("userPostNumber >=", value, "userpostnumber");
            return (Criteria) this;
        }

        public Criteria andUserpostnumberLessThan(String value) {
            addCriterion("userPostNumber <", value, "userpostnumber");
            return (Criteria) this;
        }

        public Criteria andUserpostnumberLessThanOrEqualTo(String value) {
            addCriterion("userPostNumber <=", value, "userpostnumber");
            return (Criteria) this;
        }

        public Criteria andUserpostnumberLike(String value) {
            addCriterion("userPostNumber like", value, "userpostnumber");
            return (Criteria) this;
        }

        public Criteria andUserpostnumberNotLike(String value) {
            addCriterion("userPostNumber not like", value, "userpostnumber");
            return (Criteria) this;
        }

        public Criteria andUserpostnumberIn(List<String> values) {
            addCriterion("userPostNumber in", values, "userpostnumber");
            return (Criteria) this;
        }

        public Criteria andUserpostnumberNotIn(List<String> values) {
            addCriterion("userPostNumber not in", values, "userpostnumber");
            return (Criteria) this;
        }

        public Criteria andUserpostnumberBetween(String value1, String value2) {
            addCriterion("userPostNumber between", value1, value2, "userpostnumber");
            return (Criteria) this;
        }

        public Criteria andUserpostnumberNotBetween(String value1, String value2) {
            addCriterion("userPostNumber not between", value1, value2, "userpostnumber");
            return (Criteria) this;
        }

        public Criteria andUserisadminIsNull() {
            addCriterion("userIsadmin is null");
            return (Criteria) this;
        }

        public Criteria andUserisadminIsNotNull() {
            addCriterion("userIsadmin is not null");
            return (Criteria) this;
        }

        public Criteria andUserisadminEqualTo(Integer value) {
            addCriterion("userIsadmin =", value, "userisadmin");
            return (Criteria) this;
        }

        public Criteria andUserisadminNotEqualTo(Integer value) {
            addCriterion("userIsadmin <>", value, "userisadmin");
            return (Criteria) this;
        }

        public Criteria andUserisadminGreaterThan(Integer value) {
            addCriterion("userIsadmin >", value, "userisadmin");
            return (Criteria) this;
        }

        public Criteria andUserisadminGreaterThanOrEqualTo(Integer value) {
            addCriterion("userIsadmin >=", value, "userisadmin");
            return (Criteria) this;
        }

        public Criteria andUserisadminLessThan(Integer value) {
            addCriterion("userIsadmin <", value, "userisadmin");
            return (Criteria) this;
        }

        public Criteria andUserisadminLessThanOrEqualTo(Integer value) {
            addCriterion("userIsadmin <=", value, "userisadmin");
            return (Criteria) this;
        }

        public Criteria andUserisadminIn(List<Integer> values) {
            addCriterion("userIsadmin in", values, "userisadmin");
            return (Criteria) this;
        }

        public Criteria andUserisadminNotIn(List<Integer> values) {
            addCriterion("userIsadmin not in", values, "userisadmin");
            return (Criteria) this;
        }

        public Criteria andUserisadminBetween(Integer value1, Integer value2) {
            addCriterion("userIsadmin between", value1, value2, "userisadmin");
            return (Criteria) this;
        }

        public Criteria andUserisadminNotBetween(Integer value1, Integer value2) {
            addCriterion("userIsadmin not between", value1, value2, "userisadmin");
            return (Criteria) this;
        }

        public Criteria andUserquestionIsNull() {
            addCriterion("userQuestion is null");
            return (Criteria) this;
        }

        public Criteria andUserquestionIsNotNull() {
            addCriterion("userQuestion is not null");
            return (Criteria) this;
        }

        public Criteria andUserquestionEqualTo(String value) {
            addCriterion("userQuestion =", value, "userquestion");
            return (Criteria) this;
        }

        public Criteria andUserquestionNotEqualTo(String value) {
            addCriterion("userQuestion <>", value, "userquestion");
            return (Criteria) this;
        }

        public Criteria andUserquestionGreaterThan(String value) {
            addCriterion("userQuestion >", value, "userquestion");
            return (Criteria) this;
        }

        public Criteria andUserquestionGreaterThanOrEqualTo(String value) {
            addCriterion("userQuestion >=", value, "userquestion");
            return (Criteria) this;
        }

        public Criteria andUserquestionLessThan(String value) {
            addCriterion("userQuestion <", value, "userquestion");
            return (Criteria) this;
        }

        public Criteria andUserquestionLessThanOrEqualTo(String value) {
            addCriterion("userQuestion <=", value, "userquestion");
            return (Criteria) this;
        }

        public Criteria andUserquestionLike(String value) {
            addCriterion("userQuestion like", value, "userquestion");
            return (Criteria) this;
        }

        public Criteria andUserquestionNotLike(String value) {
            addCriterion("userQuestion not like", value, "userquestion");
            return (Criteria) this;
        }

        public Criteria andUserquestionIn(List<String> values) {
            addCriterion("userQuestion in", values, "userquestion");
            return (Criteria) this;
        }

        public Criteria andUserquestionNotIn(List<String> values) {
            addCriterion("userQuestion not in", values, "userquestion");
            return (Criteria) this;
        }

        public Criteria andUserquestionBetween(String value1, String value2) {
            addCriterion("userQuestion between", value1, value2, "userquestion");
            return (Criteria) this;
        }

        public Criteria andUserquestionNotBetween(String value1, String value2) {
            addCriterion("userQuestion not between", value1, value2, "userquestion");
            return (Criteria) this;
        }

        public Criteria andUseranswerIsNull() {
            addCriterion("userAnswer is null");
            return (Criteria) this;
        }

        public Criteria andUseranswerIsNotNull() {
            addCriterion("userAnswer is not null");
            return (Criteria) this;
        }

        public Criteria andUseranswerEqualTo(String value) {
            addCriterion("userAnswer =", value, "useranswer");
            return (Criteria) this;
        }

        public Criteria andUseranswerNotEqualTo(String value) {
            addCriterion("userAnswer <>", value, "useranswer");
            return (Criteria) this;
        }

        public Criteria andUseranswerGreaterThan(String value) {
            addCriterion("userAnswer >", value, "useranswer");
            return (Criteria) this;
        }

        public Criteria andUseranswerGreaterThanOrEqualTo(String value) {
            addCriterion("userAnswer >=", value, "useranswer");
            return (Criteria) this;
        }

        public Criteria andUseranswerLessThan(String value) {
            addCriterion("userAnswer <", value, "useranswer");
            return (Criteria) this;
        }

        public Criteria andUseranswerLessThanOrEqualTo(String value) {
            addCriterion("userAnswer <=", value, "useranswer");
            return (Criteria) this;
        }

        public Criteria andUseranswerLike(String value) {
            addCriterion("userAnswer like", value, "useranswer");
            return (Criteria) this;
        }

        public Criteria andUseranswerNotLike(String value) {
            addCriterion("userAnswer not like", value, "useranswer");
            return (Criteria) this;
        }

        public Criteria andUseranswerIn(List<String> values) {
            addCriterion("userAnswer in", values, "useranswer");
            return (Criteria) this;
        }

        public Criteria andUseranswerNotIn(List<String> values) {
            addCriterion("userAnswer not in", values, "useranswer");
            return (Criteria) this;
        }

        public Criteria andUseranswerBetween(String value1, String value2) {
            addCriterion("userAnswer between", value1, value2, "useranswer");
            return (Criteria) this;
        }

        public Criteria andUseranswerNotBetween(String value1, String value2) {
            addCriterion("userAnswer not between", value1, value2, "useranswer");
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