package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.OrderEditAddShippingLineInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class OrderEditAddShippingLineGraphQLQuery extends GraphQLQuery {
  public OrderEditAddShippingLineGraphQLQuery(String id, OrderEditAddShippingLineInput shippingLine,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (shippingLine != null || fieldsSet.contains("shippingLine")) {
        getInput().put("shippingLine", shippingLine);
    }
  }

  public OrderEditAddShippingLineGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "orderEditAddShippingLine";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private OrderEditAddShippingLineInput shippingLine;

    private String queryName;

    public OrderEditAddShippingLineGraphQLQuery build() {
      return new OrderEditAddShippingLineGraphQLQuery(id, shippingLine, queryName, fieldsSet);
               
    }

    
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    
    public Builder shippingLine(OrderEditAddShippingLineInput shippingLine) {
      this.shippingLine = shippingLine;
      this.fieldsSet.add("shippingLine");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
