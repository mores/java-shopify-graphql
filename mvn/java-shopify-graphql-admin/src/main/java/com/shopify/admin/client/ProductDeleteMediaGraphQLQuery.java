package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import graphql.language.VariableDefinition;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Deletes media from a [`Product`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product),
 * such as images, videos, and 3D models.
 *   
 * When you delete media images, the mutation also removes any corresponding
 * product images. The mutation returns the IDs of both the deleted media and any
 * product images that the deletion removed.
 *   
 * > Caution:
 * > This action is irreversible. You can't recover deleted media.
 */
public class ProductDeleteMediaGraphQLQuery extends GraphQLQuery {
  public ProductDeleteMediaGraphQLQuery(String productId, List<String> mediaIds, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (productId != null || fieldsSet.contains("productId")) {
        getInput().put("productId", productId);
    }if (mediaIds != null || fieldsSet.contains("mediaIds")) {
        getInput().put("mediaIds", mediaIds);
    }
  }

  public ProductDeleteMediaGraphQLQuery(String productId, List<String> mediaIds, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (productId != null || fieldsSet.contains("productId")) {
        getInput().put("productId", productId);
    }if (mediaIds != null || fieldsSet.contains("mediaIds")) {
        getInput().put("mediaIds", mediaIds);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public ProductDeleteMediaGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productDeleteMedia";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String productId;

    private List<String> mediaIds;

    private String queryName;

    public ProductDeleteMediaGraphQLQuery build() {
      return new ProductDeleteMediaGraphQLQuery(productId, mediaIds, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * Specifies the product ID from which the media will be deleted.
     */
    public Builder productId(String productId) {
      this.productId = productId;
      this.fieldsSet.add("productId");
      return this;
    }

    /**
     * Specifies the product ID from which the media will be deleted.
     */
    public Builder productIdReference(String variableRef) {
      this.variableReferences.put("productId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("productId");
      return this;
    }

    /**
     * The media IDs to be deleted.
     */
    public Builder mediaIds(List<String> mediaIds) {
      this.mediaIds = mediaIds;
      this.fieldsSet.add("mediaIds");
      return this;
    }

    /**
     * The media IDs to be deleted.
     */
    public Builder mediaIdsReference(String variableRef) {
      this.variableReferences.put("mediaIds", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("ID"))))).build());
      this.fieldsSet.add("mediaIds");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
