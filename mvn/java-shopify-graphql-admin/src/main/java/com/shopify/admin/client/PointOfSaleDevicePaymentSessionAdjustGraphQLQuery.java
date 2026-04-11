package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MoneyInput;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Set;

/**
 * Adds an adjustment to a point of sale device payment session.
 */
public class PointOfSaleDevicePaymentSessionAdjustGraphQLQuery extends GraphQLQuery {
  public PointOfSaleDevicePaymentSessionAdjustGraphQLQuery(String pointOfSaleDevicePaymentSessionId,
      MoneyInput cash, String staffMemberId, String reasonCodeId, String note, OffsetDateTime time,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (pointOfSaleDevicePaymentSessionId != null || fieldsSet.contains("pointOfSaleDevicePaymentSessionId")) {
        getInput().put("pointOfSaleDevicePaymentSessionId", pointOfSaleDevicePaymentSessionId);
    }if (cash != null || fieldsSet.contains("cash")) {
        getInput().put("cash", cash);
    }if (staffMemberId != null || fieldsSet.contains("staffMemberId")) {
        getInput().put("staffMemberId", staffMemberId);
    }if (reasonCodeId != null || fieldsSet.contains("reasonCodeId")) {
        getInput().put("reasonCodeId", reasonCodeId);
    }if (note != null || fieldsSet.contains("note")) {
        getInput().put("note", note);
    }if (time != null || fieldsSet.contains("time")) {
        getInput().put("time", time);
    }
  }

  public PointOfSaleDevicePaymentSessionAdjustGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "pointOfSaleDevicePaymentSessionAdjust";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String pointOfSaleDevicePaymentSessionId;

    private MoneyInput cash;

    private String staffMemberId;

    private String reasonCodeId;

    private String note;

    private OffsetDateTime time;

    private String queryName;

    public PointOfSaleDevicePaymentSessionAdjustGraphQLQuery build() {
      return new PointOfSaleDevicePaymentSessionAdjustGraphQLQuery(pointOfSaleDevicePaymentSessionId, cash, staffMemberId, reasonCodeId, note, time, queryName, fieldsSet);
               
    }

    /**
     * The point of sale device payment session to be adjusted.
     */
    public Builder pointOfSaleDevicePaymentSessionId(String pointOfSaleDevicePaymentSessionId) {
      this.pointOfSaleDevicePaymentSessionId = pointOfSaleDevicePaymentSessionId;
      this.fieldsSet.add("pointOfSaleDevicePaymentSessionId");
      return this;
    }

    /**
     * The amount of cash being added or removed.
     */
    public Builder cash(MoneyInput cash) {
      this.cash = cash;
      this.fieldsSet.add("cash");
      return this;
    }

    /**
     * The staff member who made the adjustment.
     */
    public Builder staffMemberId(String staffMemberId) {
      this.staffMemberId = staffMemberId;
      this.fieldsSet.add("staffMemberId");
      return this;
    }

    /**
     * The reason code for the adjustment.
     */
    public Builder reasonCodeId(String reasonCodeId) {
      this.reasonCodeId = reasonCodeId;
      this.fieldsSet.add("reasonCodeId");
      return this;
    }

    /**
     * The note entered when the adjustment was made.
     */
    public Builder note(String note) {
      this.note = note;
      this.fieldsSet.add("note");
      return this;
    }

    /**
     * The time when the adjustment was made. Defaults to the current time.
     */
    public Builder time(OffsetDateTime time) {
      this.time = time;
      this.fieldsSet.add("time");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
