package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MoneyInput;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Set;

/**
 * Opens a point of sale device payment session.
 */
public class PointOfSaleDevicePaymentSessionOpenGraphQLQuery extends GraphQLQuery {
  public PointOfSaleDevicePaymentSessionOpenGraphQLQuery(String pointOfSaleDeviceId,
      MoneyInput balance, String staffMemberId, OffsetDateTime time, String reasonCodeId,
      String note, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (pointOfSaleDeviceId != null || fieldsSet.contains("pointOfSaleDeviceId")) {
        getInput().put("pointOfSaleDeviceId", pointOfSaleDeviceId);
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

  public PointOfSaleDevicePaymentSessionOpenGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "pointOfSaleDevicePaymentSessionOpen";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String pointOfSaleDeviceId;

    private MoneyInput balance;

    private String staffMemberId;

    private OffsetDateTime time;

    private String reasonCodeId;

    private String note;

    private String queryName;

    public PointOfSaleDevicePaymentSessionOpenGraphQLQuery build() {
      return new PointOfSaleDevicePaymentSessionOpenGraphQLQuery(pointOfSaleDeviceId, balance, staffMemberId, time, reasonCodeId, note, queryName, fieldsSet);
               
    }

    /**
     * The point of sale device to which this session belongs.
     */
    public Builder pointOfSaleDeviceId(String pointOfSaleDeviceId) {
      this.pointOfSaleDeviceId = pointOfSaleDeviceId;
      this.fieldsSet.add("pointOfSaleDeviceId");
      return this;
    }

    /**
     * The counted cash drawer balance when the session was opened.
     */
    public Builder balance(MoneyInput balance) {
      this.balance = balance;
      this.fieldsSet.add("balance");
      return this;
    }

    /**
     * The staff member who opened the session.
     */
    public Builder staffMemberId(String staffMemberId) {
      this.staffMemberId = staffMemberId;
      this.fieldsSet.add("staffMemberId");
      return this;
    }

    /**
     * The time the session was opened. Defaults to the current time.
     */
    public Builder time(OffsetDateTime time) {
      this.time = time;
      this.fieldsSet.add("time");
      return this;
    }

    /**
     * The reason code for the session opening.
     */
    public Builder reasonCodeId(String reasonCodeId) {
      this.reasonCodeId = reasonCodeId;
      this.fieldsSet.add("reasonCodeId");
      return this;
    }

    /**
     * The note entered when the session was opened.
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
