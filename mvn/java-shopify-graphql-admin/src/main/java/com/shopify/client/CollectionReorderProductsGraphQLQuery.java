package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.MoveInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Asynchronously reorders a set of products within a specified collection.
 * Instead of returning an updated collection, this mutation returns a job, which
 * should be [polled](https://shopify.dev/api/admin-graphql/latest/queries/job). The [`Collection.sortOrder`](https://shopify.dev/api/admin-graphql/latest/objects/Collection#field-collection-sortorder)
 * must be `MANUAL`. Displaced products will have their position altered in a
 * consistent manner, with no gaps.
 */
public class CollectionReorderProductsGraphQLQuery extends GraphQLQuery {
  public CollectionReorderProductsGraphQLQuery(String id, List<MoveInput> moves, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (moves != null || fieldsSet.contains("moves")) {
        getInput().put("moves", moves);
    }
  }

  public CollectionReorderProductsGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "collectionReorderProducts";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private List<MoveInput> moves;

    private String queryName;

    public CollectionReorderProductsGraphQLQuery build() {
      return new CollectionReorderProductsGraphQLQuery(id, moves, queryName, fieldsSet);
               
    }

    /**
     * The ID of the collection on which to reorder products.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * A list of moves to perform, which will be evaluated in order. Up to 250
     * moves are supported, the `newPosition` does not have to be unique.
     */
    public Builder moves(List<MoveInput> moves) {
      this.moves = moves;
      this.fieldsSet.add("moves");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
