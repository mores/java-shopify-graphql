package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CatalogUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates an existing catalog.
 */
public class CatalogUpdateGraphQLQuery extends GraphQLQuery {
  public CatalogUpdateGraphQLQuery(String id, CatalogUpdateInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public CatalogUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "catalogUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private CatalogUpdateInput input;

    private String queryName;

    public CatalogUpdateGraphQLQuery build() {
      return new CatalogUpdateGraphQLQuery(id, input, queryName, fieldsSet);
               
    }

    /**
     * The ID of the catalog to update.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The properties of the updated catalog.
     */
    public Builder input(CatalogUpdateInput input) {
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
