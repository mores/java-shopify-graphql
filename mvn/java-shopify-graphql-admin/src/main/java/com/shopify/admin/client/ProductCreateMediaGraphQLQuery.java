package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CreateMediaInput;
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
 * Adds media files to a [`Product`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product),
 * such as images, videos, or 3D models. Media files enhance product listings by
 * providing visual representations that help customers understand the product.
 *   
 * The mutation accepts an array of [`CreateMediaInput`](https://shopify.dev/docs/api/admin-graphql/latest/input-objects/CreateMediaInput)
 * objects, each specifying the source URL, content type, and optional alt text.
 *   
 * You can add multiple media files in a single request. The mutation adds all
 * valid files and returns errors for any invalid ones.
 */
public class ProductCreateMediaGraphQLQuery extends GraphQLQuery {
  public ProductCreateMediaGraphQLQuery(String productId, List<CreateMediaInput> media,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (productId != null || fieldsSet.contains("productId")) {
        getInput().put("productId", productId);
    }if (media != null || fieldsSet.contains("media")) {
        getInput().put("media", media);
    }
  }

  public ProductCreateMediaGraphQLQuery(String productId, List<CreateMediaInput> media,
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

  public ProductCreateMediaGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productCreateMedia";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String productId;

    private List<CreateMediaInput> media;

    private String queryName;

    public ProductCreateMediaGraphQLQuery build() {
      return new ProductCreateMediaGraphQLQuery(productId, media, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * Specifies the product associated with the media.
     */
    public Builder productId(String productId) {
      this.productId = productId;
      this.fieldsSet.add("productId");
      return this;
    }

    /**
     * Specifies the product associated with the media.
     */
    public Builder productIdReference(String variableRef) {
      this.variableReferences.put("productId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("productId");
      return this;
    }

    /**
     * List of new media to be added to a product.
     */
    public Builder media(List<CreateMediaInput> media) {
      this.media = media;
      this.fieldsSet.add("media");
      return this;
    }

    /**
     * List of new media to be added to a product.
     */
    public Builder mediaReference(String variableRef) {
      this.variableReferences.put("media", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("CreateMediaInput"))))).build());
      this.fieldsSet.add("media");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
