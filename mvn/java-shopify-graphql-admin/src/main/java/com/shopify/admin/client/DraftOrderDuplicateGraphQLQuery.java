package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Duplicates a draft order.
 */
public class DraftOrderDuplicateGraphQLQuery extends GraphQLQuery {
  public DraftOrderDuplicateGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public DraftOrderDuplicateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "draftOrderDuplicate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public DraftOrderDuplicateGraphQLQuery build() {
      return new DraftOrderDuplicateGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the draft order to duplicate.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
