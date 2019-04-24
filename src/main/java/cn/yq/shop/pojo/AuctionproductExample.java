package cn.yq.shop.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuctionproductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuctionproductExample() {
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

        public Criteria andAuctionidIsNull() {
            addCriterion("auctionId is null");
            return (Criteria) this;
        }

        public Criteria andAuctionidIsNotNull() {
            addCriterion("auctionId is not null");
            return (Criteria) this;
        }

        public Criteria andAuctionidEqualTo(Integer value) {
            addCriterion("auctionId =", value, "auctionid");
            return (Criteria) this;
        }

        public Criteria andAuctionidNotEqualTo(Integer value) {
            addCriterion("auctionId <>", value, "auctionid");
            return (Criteria) this;
        }

        public Criteria andAuctionidGreaterThan(Integer value) {
            addCriterion("auctionId >", value, "auctionid");
            return (Criteria) this;
        }

        public Criteria andAuctionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("auctionId >=", value, "auctionid");
            return (Criteria) this;
        }

        public Criteria andAuctionidLessThan(Integer value) {
            addCriterion("auctionId <", value, "auctionid");
            return (Criteria) this;
        }

        public Criteria andAuctionidLessThanOrEqualTo(Integer value) {
            addCriterion("auctionId <=", value, "auctionid");
            return (Criteria) this;
        }

        public Criteria andAuctionidIn(List<Integer> values) {
            addCriterion("auctionId in", values, "auctionid");
            return (Criteria) this;
        }

        public Criteria andAuctionidNotIn(List<Integer> values) {
            addCriterion("auctionId not in", values, "auctionid");
            return (Criteria) this;
        }

        public Criteria andAuctionidBetween(Integer value1, Integer value2) {
            addCriterion("auctionId between", value1, value2, "auctionid");
            return (Criteria) this;
        }

        public Criteria andAuctionidNotBetween(Integer value1, Integer value2) {
            addCriterion("auctionId not between", value1, value2, "auctionid");
            return (Criteria) this;
        }

        public Criteria andAuctionnameIsNull() {
            addCriterion("auctionName is null");
            return (Criteria) this;
        }

        public Criteria andAuctionnameIsNotNull() {
            addCriterion("auctionName is not null");
            return (Criteria) this;
        }

        public Criteria andAuctionnameEqualTo(String value) {
            addCriterion("auctionName =", value, "auctionname");
            return (Criteria) this;
        }

        public Criteria andAuctionnameNotEqualTo(String value) {
            addCriterion("auctionName <>", value, "auctionname");
            return (Criteria) this;
        }

        public Criteria andAuctionnameGreaterThan(String value) {
            addCriterion("auctionName >", value, "auctionname");
            return (Criteria) this;
        }

        public Criteria andAuctionnameGreaterThanOrEqualTo(String value) {
            addCriterion("auctionName >=", value, "auctionname");
            return (Criteria) this;
        }

        public Criteria andAuctionnameLessThan(String value) {
            addCriterion("auctionName <", value, "auctionname");
            return (Criteria) this;
        }

        public Criteria andAuctionnameLessThanOrEqualTo(String value) {
            addCriterion("auctionName <=", value, "auctionname");
            return (Criteria) this;
        }

        public Criteria andAuctionnameLike(String value) {
            addCriterion("auctionName like", value, "auctionname");
            return (Criteria) this;
        }

        public Criteria andAuctionnameNotLike(String value) {
            addCriterion("auctionName not like", value, "auctionname");
            return (Criteria) this;
        }

        public Criteria andAuctionnameIn(List<String> values) {
            addCriterion("auctionName in", values, "auctionname");
            return (Criteria) this;
        }

        public Criteria andAuctionnameNotIn(List<String> values) {
            addCriterion("auctionName not in", values, "auctionname");
            return (Criteria) this;
        }

        public Criteria andAuctionnameBetween(String value1, String value2) {
            addCriterion("auctionName between", value1, value2, "auctionname");
            return (Criteria) this;
        }

        public Criteria andAuctionnameNotBetween(String value1, String value2) {
            addCriterion("auctionName not between", value1, value2, "auctionname");
            return (Criteria) this;
        }

        public Criteria andAuctionstartpriceIsNull() {
            addCriterion("auctionStartPrice is null");
            return (Criteria) this;
        }

        public Criteria andAuctionstartpriceIsNotNull() {
            addCriterion("auctionStartPrice is not null");
            return (Criteria) this;
        }

        public Criteria andAuctionstartpriceEqualTo(BigDecimal value) {
            addCriterion("auctionStartPrice =", value, "auctionstartprice");
            return (Criteria) this;
        }

        public Criteria andAuctionstartpriceNotEqualTo(BigDecimal value) {
            addCriterion("auctionStartPrice <>", value, "auctionstartprice");
            return (Criteria) this;
        }

        public Criteria andAuctionstartpriceGreaterThan(BigDecimal value) {
            addCriterion("auctionStartPrice >", value, "auctionstartprice");
            return (Criteria) this;
        }

        public Criteria andAuctionstartpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("auctionStartPrice >=", value, "auctionstartprice");
            return (Criteria) this;
        }

        public Criteria andAuctionstartpriceLessThan(BigDecimal value) {
            addCriterion("auctionStartPrice <", value, "auctionstartprice");
            return (Criteria) this;
        }

        public Criteria andAuctionstartpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("auctionStartPrice <=", value, "auctionstartprice");
            return (Criteria) this;
        }

        public Criteria andAuctionstartpriceIn(List<BigDecimal> values) {
            addCriterion("auctionStartPrice in", values, "auctionstartprice");
            return (Criteria) this;
        }

        public Criteria andAuctionstartpriceNotIn(List<BigDecimal> values) {
            addCriterion("auctionStartPrice not in", values, "auctionstartprice");
            return (Criteria) this;
        }

        public Criteria andAuctionstartpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("auctionStartPrice between", value1, value2, "auctionstartprice");
            return (Criteria) this;
        }

        public Criteria andAuctionstartpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("auctionStartPrice not between", value1, value2, "auctionstartprice");
            return (Criteria) this;
        }

        public Criteria andAuctionupsetIsNull() {
            addCriterion("auctionUpset is null");
            return (Criteria) this;
        }

        public Criteria andAuctionupsetIsNotNull() {
            addCriterion("auctionUpset is not null");
            return (Criteria) this;
        }

        public Criteria andAuctionupsetEqualTo(BigDecimal value) {
            addCriterion("auctionUpset =", value, "auctionupset");
            return (Criteria) this;
        }

        public Criteria andAuctionupsetNotEqualTo(BigDecimal value) {
            addCriterion("auctionUpset <>", value, "auctionupset");
            return (Criteria) this;
        }

        public Criteria andAuctionupsetGreaterThan(BigDecimal value) {
            addCriterion("auctionUpset >", value, "auctionupset");
            return (Criteria) this;
        }

        public Criteria andAuctionupsetGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("auctionUpset >=", value, "auctionupset");
            return (Criteria) this;
        }

        public Criteria andAuctionupsetLessThan(BigDecimal value) {
            addCriterion("auctionUpset <", value, "auctionupset");
            return (Criteria) this;
        }

        public Criteria andAuctionupsetLessThanOrEqualTo(BigDecimal value) {
            addCriterion("auctionUpset <=", value, "auctionupset");
            return (Criteria) this;
        }

        public Criteria andAuctionupsetIn(List<BigDecimal> values) {
            addCriterion("auctionUpset in", values, "auctionupset");
            return (Criteria) this;
        }

        public Criteria andAuctionupsetNotIn(List<BigDecimal> values) {
            addCriterion("auctionUpset not in", values, "auctionupset");
            return (Criteria) this;
        }

        public Criteria andAuctionupsetBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("auctionUpset between", value1, value2, "auctionupset");
            return (Criteria) this;
        }

        public Criteria andAuctionupsetNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("auctionUpset not between", value1, value2, "auctionupset");
            return (Criteria) this;
        }

        public Criteria andAuctionstarttimeIsNull() {
            addCriterion("auctionStartTime is null");
            return (Criteria) this;
        }

        public Criteria andAuctionstarttimeIsNotNull() {
            addCriterion("auctionStartTime is not null");
            return (Criteria) this;
        }

        public Criteria andAuctionstarttimeEqualTo(Date value) {
            addCriterion("auctionStartTime =", value, "auctionstarttime");
            return (Criteria) this;
        }

        public Criteria andAuctionstarttimeNotEqualTo(Date value) {
            addCriterion("auctionStartTime <>", value, "auctionstarttime");
            return (Criteria) this;
        }

        public Criteria andAuctionstarttimeGreaterThan(Date value) {
            addCriterion("auctionStartTime >", value, "auctionstarttime");
            return (Criteria) this;
        }

        public Criteria andAuctionstarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("auctionStartTime >=", value, "auctionstarttime");
            return (Criteria) this;
        }

        public Criteria andAuctionstarttimeLessThan(Date value) {
            addCriterion("auctionStartTime <", value, "auctionstarttime");
            return (Criteria) this;
        }

        public Criteria andAuctionstarttimeLessThanOrEqualTo(Date value) {
            addCriterion("auctionStartTime <=", value, "auctionstarttime");
            return (Criteria) this;
        }

        public Criteria andAuctionstarttimeIn(List<Date> values) {
            addCriterion("auctionStartTime in", values, "auctionstarttime");
            return (Criteria) this;
        }

        public Criteria andAuctionstarttimeNotIn(List<Date> values) {
            addCriterion("auctionStartTime not in", values, "auctionstarttime");
            return (Criteria) this;
        }

        public Criteria andAuctionstarttimeBetween(Date value1, Date value2) {
            addCriterion("auctionStartTime between", value1, value2, "auctionstarttime");
            return (Criteria) this;
        }

        public Criteria andAuctionstarttimeNotBetween(Date value1, Date value2) {
            addCriterion("auctionStartTime not between", value1, value2, "auctionstarttime");
            return (Criteria) this;
        }

        public Criteria andAuctionendtimeIsNull() {
            addCriterion("auctionEndTime is null");
            return (Criteria) this;
        }

        public Criteria andAuctionendtimeIsNotNull() {
            addCriterion("auctionEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andAuctionendtimeEqualTo(Date value) {
            addCriterion("auctionEndTime =", value, "auctionendtime");
            return (Criteria) this;
        }

        public Criteria andAuctionendtimeNotEqualTo(Date value) {
            addCriterion("auctionEndTime <>", value, "auctionendtime");
            return (Criteria) this;
        }

        public Criteria andAuctionendtimeGreaterThan(Date value) {
            addCriterion("auctionEndTime >", value, "auctionendtime");
            return (Criteria) this;
        }

        public Criteria andAuctionendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("auctionEndTime >=", value, "auctionendtime");
            return (Criteria) this;
        }

        public Criteria andAuctionendtimeLessThan(Date value) {
            addCriterion("auctionEndTime <", value, "auctionendtime");
            return (Criteria) this;
        }

        public Criteria andAuctionendtimeLessThanOrEqualTo(Date value) {
            addCriterion("auctionEndTime <=", value, "auctionendtime");
            return (Criteria) this;
        }

        public Criteria andAuctionendtimeIn(List<Date> values) {
            addCriterion("auctionEndTime in", values, "auctionendtime");
            return (Criteria) this;
        }

        public Criteria andAuctionendtimeNotIn(List<Date> values) {
            addCriterion("auctionEndTime not in", values, "auctionendtime");
            return (Criteria) this;
        }

        public Criteria andAuctionendtimeBetween(Date value1, Date value2) {
            addCriterion("auctionEndTime between", value1, value2, "auctionendtime");
            return (Criteria) this;
        }

        public Criteria andAuctionendtimeNotBetween(Date value1, Date value2) {
            addCriterion("auctionEndTime not between", value1, value2, "auctionendtime");
            return (Criteria) this;
        }

        public Criteria andAuctionpicIsNull() {
            addCriterion("auctionPic is null");
            return (Criteria) this;
        }

        public Criteria andAuctionpicIsNotNull() {
            addCriterion("auctionPic is not null");
            return (Criteria) this;
        }

        public Criteria andAuctionpicEqualTo(String value) {
            addCriterion("auctionPic =", value, "auctionpic");
            return (Criteria) this;
        }

        public Criteria andAuctionpicNotEqualTo(String value) {
            addCriterion("auctionPic <>", value, "auctionpic");
            return (Criteria) this;
        }

        public Criteria andAuctionpicGreaterThan(String value) {
            addCriterion("auctionPic >", value, "auctionpic");
            return (Criteria) this;
        }

        public Criteria andAuctionpicGreaterThanOrEqualTo(String value) {
            addCriterion("auctionPic >=", value, "auctionpic");
            return (Criteria) this;
        }

        public Criteria andAuctionpicLessThan(String value) {
            addCriterion("auctionPic <", value, "auctionpic");
            return (Criteria) this;
        }

        public Criteria andAuctionpicLessThanOrEqualTo(String value) {
            addCriterion("auctionPic <=", value, "auctionpic");
            return (Criteria) this;
        }

        public Criteria andAuctionpicLike(String value) {
            addCriterion("auctionPic like", value, "auctionpic");
            return (Criteria) this;
        }

        public Criteria andAuctionpicNotLike(String value) {
            addCriterion("auctionPic not like", value, "auctionpic");
            return (Criteria) this;
        }

        public Criteria andAuctionpicIn(List<String> values) {
            addCriterion("auctionPic in", values, "auctionpic");
            return (Criteria) this;
        }

        public Criteria andAuctionpicNotIn(List<String> values) {
            addCriterion("auctionPic not in", values, "auctionpic");
            return (Criteria) this;
        }

        public Criteria andAuctionpicBetween(String value1, String value2) {
            addCriterion("auctionPic between", value1, value2, "auctionpic");
            return (Criteria) this;
        }

        public Criteria andAuctionpicNotBetween(String value1, String value2) {
            addCriterion("auctionPic not between", value1, value2, "auctionpic");
            return (Criteria) this;
        }

        public Criteria andAuctionpictypeIsNull() {
            addCriterion("auctionPicType is null");
            return (Criteria) this;
        }

        public Criteria andAuctionpictypeIsNotNull() {
            addCriterion("auctionPicType is not null");
            return (Criteria) this;
        }

        public Criteria andAuctionpictypeEqualTo(String value) {
            addCriterion("auctionPicType =", value, "auctionpictype");
            return (Criteria) this;
        }

        public Criteria andAuctionpictypeNotEqualTo(String value) {
            addCriterion("auctionPicType <>", value, "auctionpictype");
            return (Criteria) this;
        }

        public Criteria andAuctionpictypeGreaterThan(String value) {
            addCriterion("auctionPicType >", value, "auctionpictype");
            return (Criteria) this;
        }

        public Criteria andAuctionpictypeGreaterThanOrEqualTo(String value) {
            addCriterion("auctionPicType >=", value, "auctionpictype");
            return (Criteria) this;
        }

        public Criteria andAuctionpictypeLessThan(String value) {
            addCriterion("auctionPicType <", value, "auctionpictype");
            return (Criteria) this;
        }

        public Criteria andAuctionpictypeLessThanOrEqualTo(String value) {
            addCriterion("auctionPicType <=", value, "auctionpictype");
            return (Criteria) this;
        }

        public Criteria andAuctionpictypeLike(String value) {
            addCriterion("auctionPicType like", value, "auctionpictype");
            return (Criteria) this;
        }

        public Criteria andAuctionpictypeNotLike(String value) {
            addCriterion("auctionPicType not like", value, "auctionpictype");
            return (Criteria) this;
        }

        public Criteria andAuctionpictypeIn(List<String> values) {
            addCriterion("auctionPicType in", values, "auctionpictype");
            return (Criteria) this;
        }

        public Criteria andAuctionpictypeNotIn(List<String> values) {
            addCriterion("auctionPicType not in", values, "auctionpictype");
            return (Criteria) this;
        }

        public Criteria andAuctionpictypeBetween(String value1, String value2) {
            addCriterion("auctionPicType between", value1, value2, "auctionpictype");
            return (Criteria) this;
        }

        public Criteria andAuctionpictypeNotBetween(String value1, String value2) {
            addCriterion("auctionPicType not between", value1, value2, "auctionpictype");
            return (Criteria) this;
        }

        public Criteria andAuctiondescIsNull() {
            addCriterion("auctionDesc is null");
            return (Criteria) this;
        }

        public Criteria andAuctiondescIsNotNull() {
            addCriterion("auctionDesc is not null");
            return (Criteria) this;
        }

        public Criteria andAuctiondescEqualTo(String value) {
            addCriterion("auctionDesc =", value, "auctiondesc");
            return (Criteria) this;
        }

        public Criteria andAuctiondescNotEqualTo(String value) {
            addCriterion("auctionDesc <>", value, "auctiondesc");
            return (Criteria) this;
        }

        public Criteria andAuctiondescGreaterThan(String value) {
            addCriterion("auctionDesc >", value, "auctiondesc");
            return (Criteria) this;
        }

        public Criteria andAuctiondescGreaterThanOrEqualTo(String value) {
            addCriterion("auctionDesc >=", value, "auctiondesc");
            return (Criteria) this;
        }

        public Criteria andAuctiondescLessThan(String value) {
            addCriterion("auctionDesc <", value, "auctiondesc");
            return (Criteria) this;
        }

        public Criteria andAuctiondescLessThanOrEqualTo(String value) {
            addCriterion("auctionDesc <=", value, "auctiondesc");
            return (Criteria) this;
        }

        public Criteria andAuctiondescLike(String value) {
            addCriterion("auctionDesc like", value, "auctiondesc");
            return (Criteria) this;
        }

        public Criteria andAuctiondescNotLike(String value) {
            addCriterion("auctionDesc not like", value, "auctiondesc");
            return (Criteria) this;
        }

        public Criteria andAuctiondescIn(List<String> values) {
            addCriterion("auctionDesc in", values, "auctiondesc");
            return (Criteria) this;
        }

        public Criteria andAuctiondescNotIn(List<String> values) {
            addCriterion("auctionDesc not in", values, "auctiondesc");
            return (Criteria) this;
        }

        public Criteria andAuctiondescBetween(String value1, String value2) {
            addCriterion("auctionDesc between", value1, value2, "auctiondesc");
            return (Criteria) this;
        }

        public Criteria andAuctiondescNotBetween(String value1, String value2) {
            addCriterion("auctionDesc not between", value1, value2, "auctiondesc");
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