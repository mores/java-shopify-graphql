package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Count of product variants. Limited to a maximum of 10000 by default.
 */
public class ProductVariantsCountGraphQLQuery extends GraphQLQuery {
  public ProductVariantsCountGraphQLQuery(String query, Integer limit, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (query != null || fieldsSet.contains("query")) {
        getInput().put("query", query);
    }if (limit != null || fieldsSet.contains("limit")) {
        getInput().put("limit", limit);
    }
  }

  public ProductVariantsCountGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "productVariantsCount";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String query;

    private Integer limit;

    private String queryName;

    public ProductVariantsCountGraphQLQuery build() {
      return new ProductVariantsCountGraphQLQuery(query, limit, queryName, fieldsSet);
               
    }

    /**
     * No supported search fields.
     */
    public Builder query(String query) {
      this.query = query;
      this.fieldsSet.add("query");
      return this;
    }

    /**
     * The upper bound on count value before returning a result. Use `null` to have no limit.
     */
    public Builder limit(Integer limit) {
      this.limit = limit;
      this.fieldsSet.add("limit");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
