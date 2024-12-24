package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class OrderEditAddVariantGraphQLQuery extends GraphQLQuery {
  public OrderEditAddVariantGraphQLQuery(String id, String variantId, String locationId,
      int quantity, Boolean allowDuplicates, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (variantId != null || fieldsSet.contains("variantId")) {
        getInput().put("variantId", variantId);
    }if (locationId != null || fieldsSet.contains("locationId")) {
        getInput().put("locationId", locationId);
    }getInput().put("quantity", quantity);                   if (allowDuplicates != null || fieldsSet.contains("allowDuplicates")) {
        getInput().put("allowDuplicates", allowDuplicates);
    }
  }

  public OrderEditAddVariantGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "orderEditAddVariant";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String variantId;

    private String locationId;

    private int quantity;

    private Boolean allowDuplicates;

    private String queryName;

    public OrderEditAddVariantGraphQLQuery build() {
      return new OrderEditAddVariantGraphQLQuery(id, variantId, locationId, quantity, allowDuplicates, queryName, fieldsSet);
               
    }

    
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    
    public Builder variantId(String variantId) {
      this.variantId = variantId;
      this.fieldsSet.add("variantId");
      return this;
    }

    
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      this.fieldsSet.add("locationId");
      return this;
    }

    
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      this.fieldsSet.add("quantity");
      return this;
    }

    
    public Builder allowDuplicates(Boolean allowDuplicates) {
      this.allowDuplicates = allowDuplicates;
      this.fieldsSet.add("allowDuplicates");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
