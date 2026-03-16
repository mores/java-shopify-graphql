package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MoveInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Reorders [media](https://shopify.dev/docs/api/admin-graphql/latest/interfaces/Media)
 * attached to a product, changing their sequence in product displays. The
 * operation processes asynchronously to handle
 * [products](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product)
 * with large media collections.
 *   
 * Specify the [product ID](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productReorderMedia#arguments-id)
 * and an array of [moves](https://shopify.dev/docs/api/admin-graphql/latest/mutations/productReorderMedia#arguments-moves),
 * where each move contains a media ID and its new zero-based position.
 *   
 * > Note:
 * > Only include media items that need repositioning. Unchanged items maintain their relative order automatically.
 *   
 * The mutation returns a
 * [`Job`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Job) to
 * track the reordering progress. Poll the job status to determine when the
 * operation completes and media positions update across all sales channels.
 *   
 * Learn more about [reordering product media](https://shopify.dev/docs/apps/build/online-store/product-media#step-6-reorder-media-objects).
 */
public class ProductReorderMediaGraphQLQuery extends GraphQLQuery {
  public ProductReorderMediaGraphQLQuery(String id, List<MoveInput> moves, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (moves != null || fieldsSet.contains("moves")) {
        getInput().put("moves", moves);
    }
  }

  public ProductReorderMediaGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productReorderMedia";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private List<MoveInput> moves;

    private String queryName;

    public ProductReorderMediaGraphQLQuery build() {
      return new ProductReorderMediaGraphQLQuery(id, moves, queryName, fieldsSet);
               
    }

    /**
     * The ID of the product on which to reorder medias.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * A list of moves to perform which will be evaluated in order.
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
