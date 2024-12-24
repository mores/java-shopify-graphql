package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.OrderEditUpdateShippingLineInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class OrderEditUpdateShippingLineGraphQLQuery extends GraphQLQuery {
  public OrderEditUpdateShippingLineGraphQLQuery(String id,
      OrderEditUpdateShippingLineInput shippingLine, String shippingLineId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (shippingLine != null || fieldsSet.contains("shippingLine")) {
        getInput().put("shippingLine", shippingLine);
    }if (shippingLineId != null || fieldsSet.contains("shippingLineId")) {
        getInput().put("shippingLineId", shippingLineId);
    }
  }

  public OrderEditUpdateShippingLineGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "orderEditUpdateShippingLine";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private OrderEditUpdateShippingLineInput shippingLine;

    private String shippingLineId;

    private String queryName;

    public OrderEditUpdateShippingLineGraphQLQuery build() {
      return new OrderEditUpdateShippingLineGraphQLQuery(id, shippingLine, shippingLineId, queryName, fieldsSet);
               
    }

    
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    
    public Builder shippingLine(OrderEditUpdateShippingLineInput shippingLine) {
      this.shippingLine = shippingLine;
      this.fieldsSet.add("shippingLine");
      return this;
    }

    
    public Builder shippingLineId(String shippingLineId) {
      this.shippingLineId = shippingLineId;
      this.fieldsSet.add("shippingLineId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
