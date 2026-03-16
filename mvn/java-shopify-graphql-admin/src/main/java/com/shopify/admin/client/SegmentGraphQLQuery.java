package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Retrieves a customer
 * [`Segment`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Segment)
 * by ID. Segments are dynamic groups of customers that meet specific criteria
 * defined through [ShopifyQL queries](https://shopify.dev/docs/api/shopifyql/segment-query-language-reference).
 *   
 * Use segments for targeted marketing campaigns, analyzing customer behavior, or
 * creating personalized experiences. Each segment includes its name, creation
 * date, and the query that defines which [`Customer`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Customer)
 * objects belong to it.
 */
public class SegmentGraphQLQuery extends GraphQLQuery {
  public SegmentGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public SegmentGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "segment";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public SegmentGraphQLQuery build() {
      return new SegmentGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * Find a segment by ID.
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
