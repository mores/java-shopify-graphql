package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.MoneyInput;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class OrderEditAddCustomItemGraphQLQuery extends GraphQLQuery {
  public OrderEditAddCustomItemGraphQLQuery(String id, String title, String locationId,
      MoneyInput price, int quantity, Boolean taxable, Boolean requiresShipping, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (title != null || fieldsSet.contains("title")) {
        getInput().put("title", title);
    }if (locationId != null || fieldsSet.contains("locationId")) {
        getInput().put("locationId", locationId);
    }if (price != null || fieldsSet.contains("price")) {
        getInput().put("price", price);
    }getInput().put("quantity", quantity);                   if (taxable != null || fieldsSet.contains("taxable")) {
        getInput().put("taxable", taxable);
    }if (requiresShipping != null || fieldsSet.contains("requiresShipping")) {
        getInput().put("requiresShipping", requiresShipping);
    }
  }

  public OrderEditAddCustomItemGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "orderEditAddCustomItem";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String title;

    private String locationId;

    private MoneyInput price;

    private int quantity;

    private Boolean taxable;

    private Boolean requiresShipping;

    private String queryName;

    public OrderEditAddCustomItemGraphQLQuery build() {
      return new OrderEditAddCustomItemGraphQLQuery(id, title, locationId, price, quantity, taxable, requiresShipping, queryName, fieldsSet);
               
    }

    
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      this.fieldsSet.add("title");
      return this;
    }

    
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      this.fieldsSet.add("locationId");
      return this;
    }

    
    public Builder price(MoneyInput price) {
      this.price = price;
      this.fieldsSet.add("price");
      return this;
    }

    
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      this.fieldsSet.add("quantity");
      return this;
    }

    
    public Builder taxable(Boolean taxable) {
      this.taxable = taxable;
      this.fieldsSet.add("taxable");
      return this;
    }

    
    public Builder requiresShipping(Boolean requiresShipping) {
      this.requiresShipping = requiresShipping;
      this.fieldsSet.add("requiresShipping");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
