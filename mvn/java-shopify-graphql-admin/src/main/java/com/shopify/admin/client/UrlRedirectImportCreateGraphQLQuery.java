package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a [`UrlRedirectImport`](https://shopify.dev/api/admin-graphql/latest/objects/UrlRedirectImport) object.
 *   
 * After creating the `UrlRedirectImport` object, the `UrlRedirectImport` request
 * can be performed using the [`urlRedirectImportSubmit`](https://shopify.dev/api/admin-graphql/latest/mutations/urlRedirectImportSubmit) mutation.
 */
public class UrlRedirectImportCreateGraphQLQuery extends GraphQLQuery {
  public UrlRedirectImportCreateGraphQLQuery(String url, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (url != null || fieldsSet.contains("url")) {
        getInput().put("url", url);
    }
  }

  public UrlRedirectImportCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "urlRedirectImportCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String url;

    private String queryName;

    public UrlRedirectImportCreateGraphQLQuery build() {
      return new UrlRedirectImportCreateGraphQLQuery(url, queryName, fieldsSet);
               
    }

    /**
     * The staged upload URL of the CSV file.
     * You can download [a sample URL redirect CSV file](https://help.shopify.com/csv/sample-redirect-template.csv).
     */
    public Builder url(String url) {
      this.url = url;
      this.fieldsSet.add("url");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
