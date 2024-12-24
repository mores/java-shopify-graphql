package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.InventorySetScheduledChangesInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class InventorySetScheduledChangesGraphQLQuery extends GraphQLQuery {
  public InventorySetScheduledChangesGraphQLQuery(InventorySetScheduledChangesInput input,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public InventorySetScheduledChangesGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "inventorySetScheduledChanges";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private InventorySetScheduledChangesInput input;

    private String queryName;

    public InventorySetScheduledChangesGraphQLQuery build() {
      return new InventorySetScheduledChangesGraphQLQuery(input, queryName, fieldsSet);
               
    }

    
    public Builder input(InventorySetScheduledChangesInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
