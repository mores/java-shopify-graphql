package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates the note on the cart.
 */
public class CartNoteUpdateGraphQLQuery extends GraphQLQuery {
  public CartNoteUpdateGraphQLQuery(String cartId, String note, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (cartId != null || fieldsSet.contains("cartId")) {
        getInput().put("cartId", cartId);
    }if (note != null || fieldsSet.contains("note")) {
        getInput().put("note", note);
    }
  }

  public CartNoteUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "cartNoteUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String cartId;

    private String note;

    private String queryName;

    public CartNoteUpdateGraphQLQuery build() {
      return new CartNoteUpdateGraphQLQuery(cartId, note, queryName, fieldsSet);
               
    }

    /**
     * The ID of the cart.
     */
    public Builder cartId(String cartId) {
      this.cartId = cartId;
      this.fieldsSet.add("cartId");
      return this;
    }

    /**
     * The note on the cart.
     */
    public Builder note(String note) {
      this.note = note;
      this.fieldsSet.add("note");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
