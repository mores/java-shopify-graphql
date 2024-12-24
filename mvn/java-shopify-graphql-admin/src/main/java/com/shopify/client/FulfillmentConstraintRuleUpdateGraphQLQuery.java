package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.DeliveryMethodType;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class FulfillmentConstraintRuleUpdateGraphQLQuery extends GraphQLQuery {
  public FulfillmentConstraintRuleUpdateGraphQLQuery(String id,
      List<DeliveryMethodType> deliveryMethodTypes, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (deliveryMethodTypes != null || fieldsSet.contains("deliveryMethodTypes")) {
        getInput().put("deliveryMethodTypes", deliveryMethodTypes);
    }
  }

  public FulfillmentConstraintRuleUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentConstraintRuleUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private List<DeliveryMethodType> deliveryMethodTypes;

    private String queryName;

    public FulfillmentConstraintRuleUpdateGraphQLQuery build() {
      return new FulfillmentConstraintRuleUpdateGraphQLQuery(id, deliveryMethodTypes, queryName, fieldsSet);
               
    }

    
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    
    public Builder deliveryMethodTypes(List<DeliveryMethodType> deliveryMethodTypes) {
      this.deliveryMethodTypes = deliveryMethodTypes;
      this.fieldsSet.add("deliveryMethodTypes");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
