package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.PublicationCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a [`Publication`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Publication) that controls which
 * [`Product`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product) and [`Collection`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Collection)
 * customers can access through a [`Catalog`](https://shopify.dev/docs/api/admin-graphql/latest/interfaces/Catalog).
 *   
 * ### When to create a publication
 *   
 * Publications are **optional** for catalogs. Only create a publication if you
 * need to control which products are visible in a specific catalog context. When
 * a publication isn't associated with a catalog, product availability is
 * determined by the sales channel.
 *   
 * **Create a publication if you need to:**
 * - Restrict product visibility to a subset of your inventory for a specific market or company location
 * - Publish different product selections to different contexts
 *   
 * **Do NOT create a publication if:**
 * - You want product availability determined by the sales channel
 * - You only need custom pricing (use a price list on the catalog instead)
 *   
 * ### Configuration options
 *   
 * You can create an empty publication and add products later, or prepopulate it
 * with all existing products. The [`autoPublish`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/publicationCreate#arguments-input.fields.autoPublish)
 * field determines whether the publication automatically adds newly created products.
 */
public class PublicationCreateGraphQLQuery extends GraphQLQuery {
  public PublicationCreateGraphQLQuery(PublicationCreateInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public PublicationCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "publicationCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private PublicationCreateInput input;

    private String queryName;

    public PublicationCreateGraphQLQuery build() {
      return new PublicationCreateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The input fields to use when creating the publication.
     */
    public Builder input(PublicationCreateInput input) {
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
