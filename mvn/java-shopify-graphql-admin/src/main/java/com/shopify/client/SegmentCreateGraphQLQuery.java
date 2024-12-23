package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a segment.
 */
public class SegmentCreateGraphQLQuery extends GraphQLQuery {
  public SegmentCreateGraphQLQuery(String name, String query, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (name != null || fieldsSet.contains("name")) {
        getInput().put("name", name);
    }if (query != null || fieldsSet.contains("query")) {
        getInput().put("query", query);
    }
  }

  public SegmentCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "segmentCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String name;

    private String query;

    private String queryName;

    public SegmentCreateGraphQLQuery build() {
      return new SegmentCreateGraphQLQuery(name, query, queryName, fieldsSet);
               
    }

    /**
     * The name of the segment to be created. Segment names must be unique.
     */
    public Builder name(String name) {
      this.name = name;
      this.fieldsSet.add("name");
      return this;
    }

    /**
     * A precise definition of the segment. The definition is composed of a
     * combination of conditions on facts about customers such as
     * `email_subscription_status = 'SUBSCRIBED'` with [this
     * syntax](https://shopify.dev/api/shopifyql/segment-query-language-reference).
     */
    public Builder query(String query) {
      this.query = query;
      this.fieldsSet.add("query");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
