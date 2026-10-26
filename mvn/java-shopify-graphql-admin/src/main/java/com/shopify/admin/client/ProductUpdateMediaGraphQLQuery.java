package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.UpdateMediaInput;
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
 * Updates properties of media attached to a [`Product`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product).
 * You can modify alt text for accessibility or change preview images for
 * existing media items.
 *   
 * Provide the product ID and an array of [`UpdateMediaInput`](https://shopify.dev/docs/api/admin-graphql/latest/input-objects/UpdateMediaInput)
 * objects. Each update specifies the media's ID and the properties to change.
 * Updates apply only to media already attached to the product and don't affect
 * their position in the product gallery.
 */
public class ProductUpdateMediaGraphQLQuery extends GraphQLQuery {
  public ProductUpdateMediaGraphQLQuery(String productId, List<UpdateMediaInput> media,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (productId != null || fieldsSet.contains("productId")) {
        getInput().put("productId", productId);
    }if (media != null || fieldsSet.contains("media")) {
        getInput().put("media", media);
    }
  }

  public ProductUpdateMediaGraphQLQuery(String productId, List<UpdateMediaInput> media,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (productId != null || fieldsSet.contains("productId")) {
        getInput().put("productId", productId);
    }if (media != null || fieldsSet.contains("media")) {
        getInput().put("media", media);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public ProductUpdateMediaGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productUpdateMedia";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String productId;

    private List<UpdateMediaInput> media;

    private String queryName;

    public ProductUpdateMediaGraphQLQuery build() {
      return new ProductUpdateMediaGraphQLQuery(productId, media, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * Specifies the product on which media will be updated.
     */
    public Builder productId(String productId) {
      this.productId = productId;
      this.fieldsSet.add("productId");
      return this;
    }

    /**
     * Specifies the product on which media will be updated.
     */
    public Builder productIdReference(String variableRef) {
      this.variableReferences.put("productId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("productId");
      return this;
    }

    /**
     * A list of media updates.
     */
    public Builder media(List<UpdateMediaInput> media) {
      this.media = media;
      this.fieldsSet.add("media");
      return this;
    }

    /**
     * A list of media updates.
     */
    public Builder mediaReference(String variableRef) {
      this.variableReferences.put("media", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("UpdateMediaInput"))))).build());
      this.fieldsSet.add("media");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
