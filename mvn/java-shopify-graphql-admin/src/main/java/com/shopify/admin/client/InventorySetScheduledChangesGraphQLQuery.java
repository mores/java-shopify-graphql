package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.InventorySetScheduledChangesInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Set up scheduled changes of inventory items.
 *   
 * > Caution:
 * > As of 2026-01, this mutation supports an optional idempotency key using the `@idempotent` directive.
 * > As of 2026-04, the idempotency key is required and must be provided using the `@idempotent` directive.
 * > For more information, see the [idempotency documentation](https://shopify.dev/docs/api/usage/idempotent-requests).
 */
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

    /**
     * The input fields for setting up scheduled changes of inventory items.
     */
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
