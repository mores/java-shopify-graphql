package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MoneyInput;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Set;

/**
 * Closes a point of sale device payment session.
 */
public class PointOfSaleDevicePaymentSessionCloseGraphQLQuery extends GraphQLQuery {
  public PointOfSaleDevicePaymentSessionCloseGraphQLQuery(String pointOfSaleDevicePaymentSessionId,
      MoneyInput balance, String staffMemberId, OffsetDateTime time, String reasonCodeId,
      String note, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (pointOfSaleDevicePaymentSessionId != null || fieldsSet.contains("pointOfSaleDevicePaymentSessionId")) {
        getInput().put("pointOfSaleDevicePaymentSessionId", pointOfSaleDevicePaymentSessionId);
    }if (balance != null || fieldsSet.contains("balance")) {
        getInput().put("balance", balance);
    }if (staffMemberId != null || fieldsSet.contains("staffMemberId")) {
        getInput().put("staffMemberId", staffMemberId);
    }if (time != null || fieldsSet.contains("time")) {
        getInput().put("time", time);
    }if (reasonCodeId != null || fieldsSet.contains("reasonCodeId")) {
        getInput().put("reasonCodeId", reasonCodeId);
    }if (note != null || fieldsSet.contains("note")) {
        getInput().put("note", note);
    }
  }

  public PointOfSaleDevicePaymentSessionCloseGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "pointOfSaleDevicePaymentSessionClose";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String pointOfSaleDevicePaymentSessionId;

    private MoneyInput balance;

    private String staffMemberId;

    private OffsetDateTime time;

    private String reasonCodeId;

    private String note;

    private String queryName;

    public PointOfSaleDevicePaymentSessionCloseGraphQLQuery build() {
      return new PointOfSaleDevicePaymentSessionCloseGraphQLQuery(pointOfSaleDevicePaymentSessionId, balance, staffMemberId, time, reasonCodeId, note, queryName, fieldsSet);
               
    }

    /**
     * The point of sale device payment session to be closed.
     */
    public Builder pointOfSaleDevicePaymentSessionId(String pointOfSaleDevicePaymentSessionId) {
      this.pointOfSaleDevicePaymentSessionId = pointOfSaleDevicePaymentSessionId;
      this.fieldsSet.add("pointOfSaleDevicePaymentSessionId");
      return this;
    }

    /**
     * The counted cash drawer balance when the session was closed.
     */
    public Builder balance(MoneyInput balance) {
      this.balance = balance;
      this.fieldsSet.add("balance");
      return this;
    }

    /**
     * The staff member who closed the session.
     */
    public Builder staffMemberId(String staffMemberId) {
      this.staffMemberId = staffMemberId;
      this.fieldsSet.add("staffMemberId");
      return this;
    }

    /**
     * When the session was closed. Defaults to the current time.
     */
    public Builder time(OffsetDateTime time) {
      this.time = time;
      this.fieldsSet.add("time");
      return this;
    }

    /**
     * The reason code for closing the session.
     */
    public Builder reasonCodeId(String reasonCodeId) {
      this.reasonCodeId = reasonCodeId;
      this.fieldsSet.add("reasonCodeId");
      return this;
    }

    /**
     * The note entered when the session was closed.
     */
    public Builder note(String note) {
      this.note = note;
      this.fieldsSet.add("note");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
