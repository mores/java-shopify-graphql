package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class PaymentReminderSendGraphQLQuery extends GraphQLQuery {
  public PaymentReminderSendGraphQLQuery(String paymentScheduleId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (paymentScheduleId != null || fieldsSet.contains("paymentScheduleId")) {
        getInput().put("paymentScheduleId", paymentScheduleId);
    }
  }

  public PaymentReminderSendGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "paymentReminderSend";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String paymentScheduleId;

    private String queryName;

    public PaymentReminderSendGraphQLQuery build() {
      return new PaymentReminderSendGraphQLQuery(paymentScheduleId, queryName, fieldsSet);
               
    }

    
    public Builder paymentScheduleId(String paymentScheduleId) {
      this.paymentScheduleId = paymentScheduleId;
      this.fieldsSet.add("paymentScheduleId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
