package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.storefront.types.ArticleSortKeys;
import com.shopify.storefront.types.HasMetafieldsIdentifier;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class BlogProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BlogProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Blog"));
  }

  public BlogProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ArticleProjection<BlogProjection<PARENT, ROOT>, ROOT> articleByHandle() {
     ArticleProjection<BlogProjection<PARENT, ROOT>, ROOT> projection = new ArticleProjection<>(this, getRoot());
     getFields().put("articleByHandle", projection);
     return projection;
  }

  public ArticleProjection<BlogProjection<PARENT, ROOT>, ROOT> articleByHandle(String handle) {
    ArticleProjection<BlogProjection<PARENT, ROOT>, ROOT> projection = new ArticleProjection<>(this, getRoot());    
    getFields().put("articleByHandle", projection);
    getInputArguments().computeIfAbsent("articleByHandle", k -> new ArrayList<>());                      
    InputArgument handleArg = new InputArgument("handle", handle, false, null);
    getInputArguments().get("articleByHandle").add(handleArg);
    return projection;
  }

  public ArticleProjection<BlogProjection<PARENT, ROOT>, ROOT> articleByHandleWithVariableReferences(
      String handleReference) {
    ArticleProjection<BlogProjection<PARENT, ROOT>, ROOT> projection = new ArticleProjection<>(this, getRoot());    
    getFields().put("articleByHandle", projection);
    getInputArguments().computeIfAbsent("articleByHandle", k -> new ArrayList<>());              
    InputArgument handleArg = new InputArgument("handle", handleReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("String")));
    getInputArguments().get("articleByHandle").add(handleArg);
    return projection;
  }

  public ArticleConnectionProjection<BlogProjection<PARENT, ROOT>, ROOT> articles() {
     ArticleConnectionProjection<BlogProjection<PARENT, ROOT>, ROOT> projection = new ArticleConnectionProjection<>(this, getRoot());
     getFields().put("articles", projection);
     return projection;
  }

  public ArticleConnectionProjection<BlogProjection<PARENT, ROOT>, ROOT> articles(Integer first,
      String after, Integer last, String before, Boolean reverse, ArticleSortKeys sortKey,
      String query) {
    ArticleConnectionProjection<BlogProjection<PARENT, ROOT>, ROOT> projection = new ArticleConnectionProjection<>(this, getRoot());    
    getFields().put("articles", projection);
    getInputArguments().computeIfAbsent("articles", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("articles").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("articles").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("articles").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("articles").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("articles").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey, false, null);
    getInputArguments().get("articles").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query, false, null);
    getInputArguments().get("articles").add(queryArg);
    return projection;
  }

  public ArticleConnectionProjection<BlogProjection<PARENT, ROOT>, ROOT> articlesWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference, String queryReference) {
    ArticleConnectionProjection<BlogProjection<PARENT, ROOT>, ROOT> projection = new ArticleConnectionProjection<>(this, getRoot());    
    getFields().put("articles", projection);
    getInputArguments().computeIfAbsent("articles", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("articles").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("articles").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("articles").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("articles").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("articles").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKeyReference, true, new graphql.language.TypeName("ArticleSortKeys"));
    getInputArguments().get("articles").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", queryReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("articles").add(queryArg);
    return projection;
  }

  public ArticleAuthorProjection<BlogProjection<PARENT, ROOT>, ROOT> authors() {
     ArticleAuthorProjection<BlogProjection<PARENT, ROOT>, ROOT> projection = new ArticleAuthorProjection<>(this, getRoot());
     getFields().put("authors", projection);
     return projection;
  }

  public MetafieldProjection<BlogProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<BlogProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<BlogProjection<PARENT, ROOT>, ROOT> metafield(String namespace,
      String key) {
    MetafieldProjection<BlogProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace, false, null);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key, false, null);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldProjection<BlogProjection<PARENT, ROOT>, ROOT> metafieldWithVariableReferences(
      String namespaceReference, String keyReference) {
    MetafieldProjection<BlogProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());              
    InputArgument namespaceArg = new InputArgument("namespace", namespaceReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", keyReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("String")));
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldProjection<BlogProjection<PARENT, ROOT>, ROOT> metafields() {
     MetafieldProjection<BlogProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldProjection<BlogProjection<PARENT, ROOT>, ROOT> metafields(
      List<HasMetafieldsIdentifier> identifiers) {
    MetafieldProjection<BlogProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument identifiersArg = new InputArgument("identifiers", identifiers, false, null);
    getInputArguments().get("metafields").add(identifiersArg);
    return projection;
  }

  public MetafieldProjection<BlogProjection<PARENT, ROOT>, ROOT> metafieldsWithVariableReferences(
      String identifiersReference) {
    MetafieldProjection<BlogProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());              
    InputArgument identifiersArg = new InputArgument("identifiers", identifiersReference, true, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("HasMetafieldsIdentifier")))));
    getInputArguments().get("metafields").add(identifiersArg);
    return projection;
  }

  public SEOProjection<BlogProjection<PARENT, ROOT>, ROOT> seo() {
     SEOProjection<BlogProjection<PARENT, ROOT>, ROOT> projection = new SEOProjection<>(this, getRoot());
     getFields().put("seo", projection);
     return projection;
  }

  public BlogProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public BlogProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public BlogProjection<PARENT, ROOT> onlineStoreUrl() {
    getFields().put("onlineStoreUrl", null);
    return this;
  }

  public BlogProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }
}
