package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Submits a `UrlRedirectImport` request to be processed.
 *   
 * The `UrlRedirectImport` request is first created with the [`urlRedirectImportCreate`](https://shopify.dev/api/admin-graphql/latest/mutations/urlRedirectImportCreate) mutation.
 */
public class UrlRedirectImportSubmitGraphQLQuery extends GraphQLQuery {
  public UrlRedirectImportSubmitGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public UrlRedirectImportSubmitGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "urlRedirectImportSubmit";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public UrlRedirectImportSubmitGraphQLQuery build() {
      return new UrlRedirectImportSubmitGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the [`UrlRedirectImport`](https://shopify.dev/api/admin-graphql/latest/objects/UrlRedirectImport) object.
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
