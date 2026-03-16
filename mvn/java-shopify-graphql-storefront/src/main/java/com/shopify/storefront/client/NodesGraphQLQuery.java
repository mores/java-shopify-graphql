package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Retrieves multiple objects by their global IDs in a single request. Any object
 * that implements the
 * [`Node`](https://shopify.dev/docs/api/storefront/current/interfaces/Node)
 * interface can be fetched, including
 * [products](https://shopify.dev/docs/api/storefront/current/objects/Product), [collections](https://shopify.dev/docs/api/storefront/current/objects/Collection),
 * and [pages](https://shopify.dev/docs/api/storefront/current/objects/Page).
 *   
 * Use inline fragments to access type-specific fields on the returned objects. The input accepts up to 250 IDs.
 */
public class NodesGraphQLQuery extends GraphQLQuery {
  public NodesGraphQLQuery(List<String> ids, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (ids != null || fieldsSet.contains("ids")) {
        getInput().put("ids", ids);
    }
  }

  public NodesGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "nodes";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<String> ids;

    private String queryName;

    public NodesGraphQLQuery build() {
      return new NodesGraphQLQuery(ids, queryName, fieldsSet);
               
    }

    /**
     * The IDs of the Nodes to return.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder ids(List<String> ids) {
      this.ids = ids;
      this.fieldsSet.add("ids");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
