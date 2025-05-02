package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The schema’s entry-point for queries. This acts as the public, top-level API from which all queries must start.
 */
public class QueryRoot {
  /**
   * Fetch a specific Article by its ID.
   */
  private Article article;

  /**
   * List of the shop's articles.
   */
  private ArticleConnection articles;

  /**
   * Fetch a specific `Blog` by one of its unique attributes.
   */
  private Blog blog;

  /**
   * Find a blog by its handle.
   */
  private Blog blogByHandle;

  /**
   * List of the shop's blogs.
   */
  private BlogConnection blogs;

  /**
   * Retrieve a cart by its ID. For more information, refer to
   * [Manage a cart with the Storefront API](https://shopify.dev/custom-storefronts/cart/manage).
   */
  private Cart cart;

  /**
   * A poll for the status of the cart checkout completion and order creation.
   */
  private CartCompletionAttemptResult cartCompletionAttempt;

  /**
   * Fetch a specific `Collection` by one of its unique attributes.
   */
  private Collection collection;

  /**
   * Find a collection by its handle.
   */
  private Collection collectionByHandle;

  /**
   * List of the shop’s collections.
   */
  private CollectionConnection collections;

  /**
   * The customer associated with the given access token. Tokens are obtained by using the
   * [`customerAccessTokenCreate` mutation](https://shopify.dev/docs/api/storefront/latest/mutations/customerAccessTokenCreate).
   */
  private Customer customer;

  /**
   * Returns the localized experiences configured for the shop.
   */
  private Localization localization;

  /**
   * List of the shop's locations that support in-store pickup.
   *   
   * When sorting by distance, you must specify a location via the `near` argument.
   */
  private LocationConnection locations;

  /**
   * Retrieve a [navigation menu](https://help.shopify.com/manual/online-store/menus-and-links) by its handle.
   */
  private Menu menu;

  /**
   * Fetch a specific Metaobject by one of its unique identifiers.
   */
  private Metaobject metaobject;

  /**
   * All active metaobjects for the shop.
   */
  private MetaobjectConnection metaobjects;

  /**
   * Returns a specific node by ID.
   */
  private Node node;

  /**
   * Returns the list of nodes with the given IDs.
   */
  private List<Node> nodes;

  /**
   * Fetch a specific `Page` by one of its unique attributes.
   */
  private Page page;

  /**
   * Find a page by its handle.
   */
  private Page pageByHandle;

  /**
   * List of the shop's pages.
   */
  private PageConnection pages;

  /**
   * Settings related to payments.
   */
  private PaymentSettings paymentSettings;

  /**
   * List of the predictive search results.
   */
  private PredictiveSearchResult predictiveSearch;

  /**
   * Fetch a specific `Product` by one of its unique attributes.
   */
  private Product product;

  /**
   * Find a product by its handle.
   */
  private Product productByHandle;

  /**
   * Find recommended products related to a given `product_id`.
   * To learn more about how recommendations are generated, see
   * [*Showing product recommendations on product pages*](https://help.shopify.com/themes/development/recommended-products).
   */
  private List<Product> productRecommendations;

  /**
   * Tags added to products.
   * Additional access scope required: unauthenticated_read_product_tags.
   */
  private StringConnection productTags;

  /**
   * List of product types for the shop's products that are published to your app.
   */
  private StringConnection productTypes;

  /**
   * Returns a list of the shop's products. For storefront search, use the
   * [`search`](https://shopify.dev/docs/api/storefront/latest/queries/search) query.
   */
  private ProductConnection products;

  /**
   * The list of public Storefront API versions, including supported, release candidate and unstable versions.
   */
  private List<ApiVersion> publicApiVersions;

  /**
   * List of the search results.
   */
  private SearchResultItemConnection search;

  /**
   * The shop associated with the storefront access token.
   */
  private Shop shop;

  /**
   * Contains all fields required to generate sitemaps.
   */
  private Sitemap sitemap;

  /**
   * A list of redirects for a shop.
   */
  private UrlRedirectConnection urlRedirects;

  public QueryRoot() {
  }

  /**
   * Fetch a specific Article by its ID.
   */
  public Article getArticle() {
    return article;
  }

  public void setArticle(Article article) {
    this.article = article;
  }

  /**
   * List of the shop's articles.
   */
  public ArticleConnection getArticles() {
    return articles;
  }

  public void setArticles(ArticleConnection articles) {
    this.articles = articles;
  }

  /**
   * Fetch a specific `Blog` by one of its unique attributes.
   */
  public Blog getBlog() {
    return blog;
  }

  public void setBlog(Blog blog) {
    this.blog = blog;
  }

  /**
   * Find a blog by its handle.
   */
  public Blog getBlogByHandle() {
    return blogByHandle;
  }

  public void setBlogByHandle(Blog blogByHandle) {
    this.blogByHandle = blogByHandle;
  }

  /**
   * List of the shop's blogs.
   */
  public BlogConnection getBlogs() {
    return blogs;
  }

  public void setBlogs(BlogConnection blogs) {
    this.blogs = blogs;
  }

  /**
   * Retrieve a cart by its ID. For more information, refer to
   * [Manage a cart with the Storefront API](https://shopify.dev/custom-storefronts/cart/manage).
   */
  public Cart getCart() {
    return cart;
  }

  public void setCart(Cart cart) {
    this.cart = cart;
  }

  /**
   * A poll for the status of the cart checkout completion and order creation.
   */
  public CartCompletionAttemptResult getCartCompletionAttempt() {
    return cartCompletionAttempt;
  }

  public void setCartCompletionAttempt(CartCompletionAttemptResult cartCompletionAttempt) {
    this.cartCompletionAttempt = cartCompletionAttempt;
  }

  /**
   * Fetch a specific `Collection` by one of its unique attributes.
   */
  public Collection getCollection() {
    return collection;
  }

  public void setCollection(Collection collection) {
    this.collection = collection;
  }

  /**
   * Find a collection by its handle.
   */
  public Collection getCollectionByHandle() {
    return collectionByHandle;
  }

  public void setCollectionByHandle(Collection collectionByHandle) {
    this.collectionByHandle = collectionByHandle;
  }

  /**
   * List of the shop’s collections.
   */
  public CollectionConnection getCollections() {
    return collections;
  }

  public void setCollections(CollectionConnection collections) {
    this.collections = collections;
  }

  /**
   * The customer associated with the given access token. Tokens are obtained by using the
   * [`customerAccessTokenCreate` mutation](https://shopify.dev/docs/api/storefront/latest/mutations/customerAccessTokenCreate).
   */
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  /**
   * Returns the localized experiences configured for the shop.
   */
  public Localization getLocalization() {
    return localization;
  }

  public void setLocalization(Localization localization) {
    this.localization = localization;
  }

  /**
   * List of the shop's locations that support in-store pickup.
   *   
   * When sorting by distance, you must specify a location via the `near` argument.
   */
  public LocationConnection getLocations() {
    return locations;
  }

  public void setLocations(LocationConnection locations) {
    this.locations = locations;
  }

  /**
   * Retrieve a [navigation menu](https://help.shopify.com/manual/online-store/menus-and-links) by its handle.
   */
  public Menu getMenu() {
    return menu;
  }

  public void setMenu(Menu menu) {
    this.menu = menu;
  }

  /**
   * Fetch a specific Metaobject by one of its unique identifiers.
   */
  public Metaobject getMetaobject() {
    return metaobject;
  }

  public void setMetaobject(Metaobject metaobject) {
    this.metaobject = metaobject;
  }

  /**
   * All active metaobjects for the shop.
   */
  public MetaobjectConnection getMetaobjects() {
    return metaobjects;
  }

  public void setMetaobjects(MetaobjectConnection metaobjects) {
    this.metaobjects = metaobjects;
  }

  /**
   * Returns a specific node by ID.
   */
  public Node getNode() {
    return node;
  }

  public void setNode(Node node) {
    this.node = node;
  }

  /**
   * Returns the list of nodes with the given IDs.
   */
  public List<Node> getNodes() {
    return nodes;
  }

  public void setNodes(List<Node> nodes) {
    this.nodes = nodes;
  }

  /**
   * Fetch a specific `Page` by one of its unique attributes.
   */
  public Page getPage() {
    return page;
  }

  public void setPage(Page page) {
    this.page = page;
  }

  /**
   * Find a page by its handle.
   */
  public Page getPageByHandle() {
    return pageByHandle;
  }

  public void setPageByHandle(Page pageByHandle) {
    this.pageByHandle = pageByHandle;
  }

  /**
   * List of the shop's pages.
   */
  public PageConnection getPages() {
    return pages;
  }

  public void setPages(PageConnection pages) {
    this.pages = pages;
  }

  /**
   * Settings related to payments.
   */
  public PaymentSettings getPaymentSettings() {
    return paymentSettings;
  }

  public void setPaymentSettings(PaymentSettings paymentSettings) {
    this.paymentSettings = paymentSettings;
  }

  /**
   * List of the predictive search results.
   */
  public PredictiveSearchResult getPredictiveSearch() {
    return predictiveSearch;
  }

  public void setPredictiveSearch(PredictiveSearchResult predictiveSearch) {
    this.predictiveSearch = predictiveSearch;
  }

  /**
   * Fetch a specific `Product` by one of its unique attributes.
   */
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  /**
   * Find a product by its handle.
   */
  public Product getProductByHandle() {
    return productByHandle;
  }

  public void setProductByHandle(Product productByHandle) {
    this.productByHandle = productByHandle;
  }

  /**
   * Find recommended products related to a given `product_id`.
   * To learn more about how recommendations are generated, see
   * [*Showing product recommendations on product pages*](https://help.shopify.com/themes/development/recommended-products).
   */
  public List<Product> getProductRecommendations() {
    return productRecommendations;
  }

  public void setProductRecommendations(List<Product> productRecommendations) {
    this.productRecommendations = productRecommendations;
  }

  /**
   * Tags added to products.
   * Additional access scope required: unauthenticated_read_product_tags.
   */
  public StringConnection getProductTags() {
    return productTags;
  }

  public void setProductTags(StringConnection productTags) {
    this.productTags = productTags;
  }

  /**
   * List of product types for the shop's products that are published to your app.
   */
  public StringConnection getProductTypes() {
    return productTypes;
  }

  public void setProductTypes(StringConnection productTypes) {
    this.productTypes = productTypes;
  }

  /**
   * Returns a list of the shop's products. For storefront search, use the
   * [`search`](https://shopify.dev/docs/api/storefront/latest/queries/search) query.
   */
  public ProductConnection getProducts() {
    return products;
  }

  public void setProducts(ProductConnection products) {
    this.products = products;
  }

  /**
   * The list of public Storefront API versions, including supported, release candidate and unstable versions.
   */
  public List<ApiVersion> getPublicApiVersions() {
    return publicApiVersions;
  }

  public void setPublicApiVersions(List<ApiVersion> publicApiVersions) {
    this.publicApiVersions = publicApiVersions;
  }

  /**
   * List of the search results.
   */
  public SearchResultItemConnection getSearch() {
    return search;
  }

  public void setSearch(SearchResultItemConnection search) {
    this.search = search;
  }

  /**
   * The shop associated with the storefront access token.
   */
  public Shop getShop() {
    return shop;
  }

  public void setShop(Shop shop) {
    this.shop = shop;
  }

  /**
   * Contains all fields required to generate sitemaps.
   */
  public Sitemap getSitemap() {
    return sitemap;
  }

  public void setSitemap(Sitemap sitemap) {
    this.sitemap = sitemap;
  }

  /**
   * A list of redirects for a shop.
   */
  public UrlRedirectConnection getUrlRedirects() {
    return urlRedirects;
  }

  public void setUrlRedirects(UrlRedirectConnection urlRedirects) {
    this.urlRedirects = urlRedirects;
  }

  @Override
  public String toString() {
    return "QueryRoot{article='" + article + "', articles='" + articles + "', blog='" + blog + "', blogByHandle='" + blogByHandle + "', blogs='" + blogs + "', cart='" + cart + "', cartCompletionAttempt='" + cartCompletionAttempt + "', collection='" + collection + "', collectionByHandle='" + collectionByHandle + "', collections='" + collections + "', customer='" + customer + "', localization='" + localization + "', locations='" + locations + "', menu='" + menu + "', metaobject='" + metaobject + "', metaobjects='" + metaobjects + "', node='" + node + "', nodes='" + nodes + "', page='" + page + "', pageByHandle='" + pageByHandle + "', pages='" + pages + "', paymentSettings='" + paymentSettings + "', predictiveSearch='" + predictiveSearch + "', product='" + product + "', productByHandle='" + productByHandle + "', productRecommendations='" + productRecommendations + "', productTags='" + productTags + "', productTypes='" + productTypes + "', products='" + products + "', publicApiVersions='" + publicApiVersions + "', search='" + search + "', shop='" + shop + "', sitemap='" + sitemap + "', urlRedirects='" + urlRedirects + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QueryRoot that = (QueryRoot) o;
    return Objects.equals(article, that.article) &&
        Objects.equals(articles, that.articles) &&
        Objects.equals(blog, that.blog) &&
        Objects.equals(blogByHandle, that.blogByHandle) &&
        Objects.equals(blogs, that.blogs) &&
        Objects.equals(cart, that.cart) &&
        Objects.equals(cartCompletionAttempt, that.cartCompletionAttempt) &&
        Objects.equals(collection, that.collection) &&
        Objects.equals(collectionByHandle, that.collectionByHandle) &&
        Objects.equals(collections, that.collections) &&
        Objects.equals(customer, that.customer) &&
        Objects.equals(localization, that.localization) &&
        Objects.equals(locations, that.locations) &&
        Objects.equals(menu, that.menu) &&
        Objects.equals(metaobject, that.metaobject) &&
        Objects.equals(metaobjects, that.metaobjects) &&
        Objects.equals(node, that.node) &&
        Objects.equals(nodes, that.nodes) &&
        Objects.equals(page, that.page) &&
        Objects.equals(pageByHandle, that.pageByHandle) &&
        Objects.equals(pages, that.pages) &&
        Objects.equals(paymentSettings, that.paymentSettings) &&
        Objects.equals(predictiveSearch, that.predictiveSearch) &&
        Objects.equals(product, that.product) &&
        Objects.equals(productByHandle, that.productByHandle) &&
        Objects.equals(productRecommendations, that.productRecommendations) &&
        Objects.equals(productTags, that.productTags) &&
        Objects.equals(productTypes, that.productTypes) &&
        Objects.equals(products, that.products) &&
        Objects.equals(publicApiVersions, that.publicApiVersions) &&
        Objects.equals(search, that.search) &&
        Objects.equals(shop, that.shop) &&
        Objects.equals(sitemap, that.sitemap) &&
        Objects.equals(urlRedirects, that.urlRedirects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(article, articles, blog, blogByHandle, blogs, cart, cartCompletionAttempt, collection, collectionByHandle, collections, customer, localization, locations, menu, metaobject, metaobjects, node, nodes, page, pageByHandle, pages, paymentSettings, predictiveSearch, product, productByHandle, productRecommendations, productTags, productTypes, products, publicApiVersions, search, shop, sitemap, urlRedirects);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Fetch a specific Article by its ID.
     */
    private Article article;

    /**
     * List of the shop's articles.
     */
    private ArticleConnection articles;

    /**
     * Fetch a specific `Blog` by one of its unique attributes.
     */
    private Blog blog;

    /**
     * Find a blog by its handle.
     */
    private Blog blogByHandle;

    /**
     * List of the shop's blogs.
     */
    private BlogConnection blogs;

    /**
     * Retrieve a cart by its ID. For more information, refer to
     * [Manage a cart with the Storefront API](https://shopify.dev/custom-storefronts/cart/manage).
     */
    private Cart cart;

    /**
     * A poll for the status of the cart checkout completion and order creation.
     */
    private CartCompletionAttemptResult cartCompletionAttempt;

    /**
     * Fetch a specific `Collection` by one of its unique attributes.
     */
    private Collection collection;

    /**
     * Find a collection by its handle.
     */
    private Collection collectionByHandle;

    /**
     * List of the shop’s collections.
     */
    private CollectionConnection collections;

    /**
     * The customer associated with the given access token. Tokens are obtained by using the
     * [`customerAccessTokenCreate` mutation](https://shopify.dev/docs/api/storefront/latest/mutations/customerAccessTokenCreate).
     */
    private Customer customer;

    /**
     * Returns the localized experiences configured for the shop.
     */
    private Localization localization;

    /**
     * List of the shop's locations that support in-store pickup.
     *   
     * When sorting by distance, you must specify a location via the `near` argument.
     */
    private LocationConnection locations;

    /**
     * Retrieve a [navigation menu](https://help.shopify.com/manual/online-store/menus-and-links) by its handle.
     */
    private Menu menu;

    /**
     * Fetch a specific Metaobject by one of its unique identifiers.
     */
    private Metaobject metaobject;

    /**
     * All active metaobjects for the shop.
     */
    private MetaobjectConnection metaobjects;

    /**
     * Returns a specific node by ID.
     */
    private Node node;

    /**
     * Returns the list of nodes with the given IDs.
     */
    private List<Node> nodes;

    /**
     * Fetch a specific `Page` by one of its unique attributes.
     */
    private Page page;

    /**
     * Find a page by its handle.
     */
    private Page pageByHandle;

    /**
     * List of the shop's pages.
     */
    private PageConnection pages;

    /**
     * Settings related to payments.
     */
    private PaymentSettings paymentSettings;

    /**
     * List of the predictive search results.
     */
    private PredictiveSearchResult predictiveSearch;

    /**
     * Fetch a specific `Product` by one of its unique attributes.
     */
    private Product product;

    /**
     * Find a product by its handle.
     */
    private Product productByHandle;

    /**
     * Find recommended products related to a given `product_id`.
     * To learn more about how recommendations are generated, see
     * [*Showing product recommendations on product pages*](https://help.shopify.com/themes/development/recommended-products).
     */
    private List<Product> productRecommendations;

    /**
     * Tags added to products.
     * Additional access scope required: unauthenticated_read_product_tags.
     */
    private StringConnection productTags;

    /**
     * List of product types for the shop's products that are published to your app.
     */
    private StringConnection productTypes;

    /**
     * Returns a list of the shop's products. For storefront search, use the
     * [`search`](https://shopify.dev/docs/api/storefront/latest/queries/search) query.
     */
    private ProductConnection products;

    /**
     * The list of public Storefront API versions, including supported, release candidate and unstable versions.
     */
    private List<ApiVersion> publicApiVersions;

    /**
     * List of the search results.
     */
    private SearchResultItemConnection search;

    /**
     * The shop associated with the storefront access token.
     */
    private Shop shop;

    /**
     * Contains all fields required to generate sitemaps.
     */
    private Sitemap sitemap;

    /**
     * A list of redirects for a shop.
     */
    private UrlRedirectConnection urlRedirects;

    public QueryRoot build() {
      QueryRoot result = new QueryRoot();
      result.article = this.article;
      result.articles = this.articles;
      result.blog = this.blog;
      result.blogByHandle = this.blogByHandle;
      result.blogs = this.blogs;
      result.cart = this.cart;
      result.cartCompletionAttempt = this.cartCompletionAttempt;
      result.collection = this.collection;
      result.collectionByHandle = this.collectionByHandle;
      result.collections = this.collections;
      result.customer = this.customer;
      result.localization = this.localization;
      result.locations = this.locations;
      result.menu = this.menu;
      result.metaobject = this.metaobject;
      result.metaobjects = this.metaobjects;
      result.node = this.node;
      result.nodes = this.nodes;
      result.page = this.page;
      result.pageByHandle = this.pageByHandle;
      result.pages = this.pages;
      result.paymentSettings = this.paymentSettings;
      result.predictiveSearch = this.predictiveSearch;
      result.product = this.product;
      result.productByHandle = this.productByHandle;
      result.productRecommendations = this.productRecommendations;
      result.productTags = this.productTags;
      result.productTypes = this.productTypes;
      result.products = this.products;
      result.publicApiVersions = this.publicApiVersions;
      result.search = this.search;
      result.shop = this.shop;
      result.sitemap = this.sitemap;
      result.urlRedirects = this.urlRedirects;
      return result;
    }

    /**
     * Fetch a specific Article by its ID.
     */
    public Builder article(Article article) {
      this.article = article;
      return this;
    }

    /**
     * List of the shop's articles.
     */
    public Builder articles(ArticleConnection articles) {
      this.articles = articles;
      return this;
    }

    /**
     * Fetch a specific `Blog` by one of its unique attributes.
     */
    public Builder blog(Blog blog) {
      this.blog = blog;
      return this;
    }

    /**
     * Find a blog by its handle.
     */
    public Builder blogByHandle(Blog blogByHandle) {
      this.blogByHandle = blogByHandle;
      return this;
    }

    /**
     * List of the shop's blogs.
     */
    public Builder blogs(BlogConnection blogs) {
      this.blogs = blogs;
      return this;
    }

    /**
     * Retrieve a cart by its ID. For more information, refer to
     * [Manage a cart with the Storefront API](https://shopify.dev/custom-storefronts/cart/manage).
     */
    public Builder cart(Cart cart) {
      this.cart = cart;
      return this;
    }

    /**
     * A poll for the status of the cart checkout completion and order creation.
     */
    public Builder cartCompletionAttempt(CartCompletionAttemptResult cartCompletionAttempt) {
      this.cartCompletionAttempt = cartCompletionAttempt;
      return this;
    }

    /**
     * Fetch a specific `Collection` by one of its unique attributes.
     */
    public Builder collection(Collection collection) {
      this.collection = collection;
      return this;
    }

    /**
     * Find a collection by its handle.
     */
    public Builder collectionByHandle(Collection collectionByHandle) {
      this.collectionByHandle = collectionByHandle;
      return this;
    }

    /**
     * List of the shop’s collections.
     */
    public Builder collections(CollectionConnection collections) {
      this.collections = collections;
      return this;
    }

    /**
     * The customer associated with the given access token. Tokens are obtained by using the
     * [`customerAccessTokenCreate` mutation](https://shopify.dev/docs/api/storefront/latest/mutations/customerAccessTokenCreate).
     */
    public Builder customer(Customer customer) {
      this.customer = customer;
      return this;
    }

    /**
     * Returns the localized experiences configured for the shop.
     */
    public Builder localization(Localization localization) {
      this.localization = localization;
      return this;
    }

    /**
     * List of the shop's locations that support in-store pickup.
     *   
     * When sorting by distance, you must specify a location via the `near` argument.
     */
    public Builder locations(LocationConnection locations) {
      this.locations = locations;
      return this;
    }

    /**
     * Retrieve a [navigation menu](https://help.shopify.com/manual/online-store/menus-and-links) by its handle.
     */
    public Builder menu(Menu menu) {
      this.menu = menu;
      return this;
    }

    /**
     * Fetch a specific Metaobject by one of its unique identifiers.
     */
    public Builder metaobject(Metaobject metaobject) {
      this.metaobject = metaobject;
      return this;
    }

    /**
     * All active metaobjects for the shop.
     */
    public Builder metaobjects(MetaobjectConnection metaobjects) {
      this.metaobjects = metaobjects;
      return this;
    }

    /**
     * Returns a specific node by ID.
     */
    public Builder node(Node node) {
      this.node = node;
      return this;
    }

    /**
     * Returns the list of nodes with the given IDs.
     */
    public Builder nodes(List<Node> nodes) {
      this.nodes = nodes;
      return this;
    }

    /**
     * Fetch a specific `Page` by one of its unique attributes.
     */
    public Builder page(Page page) {
      this.page = page;
      return this;
    }

    /**
     * Find a page by its handle.
     */
    public Builder pageByHandle(Page pageByHandle) {
      this.pageByHandle = pageByHandle;
      return this;
    }

    /**
     * List of the shop's pages.
     */
    public Builder pages(PageConnection pages) {
      this.pages = pages;
      return this;
    }

    /**
     * Settings related to payments.
     */
    public Builder paymentSettings(PaymentSettings paymentSettings) {
      this.paymentSettings = paymentSettings;
      return this;
    }

    /**
     * List of the predictive search results.
     */
    public Builder predictiveSearch(PredictiveSearchResult predictiveSearch) {
      this.predictiveSearch = predictiveSearch;
      return this;
    }

    /**
     * Fetch a specific `Product` by one of its unique attributes.
     */
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    /**
     * Find a product by its handle.
     */
    public Builder productByHandle(Product productByHandle) {
      this.productByHandle = productByHandle;
      return this;
    }

    /**
     * Find recommended products related to a given `product_id`.
     * To learn more about how recommendations are generated, see
     * [*Showing product recommendations on product pages*](https://help.shopify.com/themes/development/recommended-products).
     */
    public Builder productRecommendations(List<Product> productRecommendations) {
      this.productRecommendations = productRecommendations;
      return this;
    }

    /**
     * Tags added to products.
     * Additional access scope required: unauthenticated_read_product_tags.
     */
    public Builder productTags(StringConnection productTags) {
      this.productTags = productTags;
      return this;
    }

    /**
     * List of product types for the shop's products that are published to your app.
     */
    public Builder productTypes(StringConnection productTypes) {
      this.productTypes = productTypes;
      return this;
    }

    /**
     * Returns a list of the shop's products. For storefront search, use the
     * [`search`](https://shopify.dev/docs/api/storefront/latest/queries/search) query.
     */
    public Builder products(ProductConnection products) {
      this.products = products;
      return this;
    }

    /**
     * The list of public Storefront API versions, including supported, release candidate and unstable versions.
     */
    public Builder publicApiVersions(List<ApiVersion> publicApiVersions) {
      this.publicApiVersions = publicApiVersions;
      return this;
    }

    /**
     * List of the search results.
     */
    public Builder search(SearchResultItemConnection search) {
      this.search = search;
      return this;
    }

    /**
     * The shop associated with the storefront access token.
     */
    public Builder shop(Shop shop) {
      this.shop = shop;
      return this;
    }

    /**
     * Contains all fields required to generate sitemaps.
     */
    public Builder sitemap(Sitemap sitemap) {
      this.sitemap = sitemap;
      return this;
    }

    /**
     * A list of redirects for a shop.
     */
    public Builder urlRedirects(UrlRedirectConnection urlRedirects) {
      this.urlRedirects = urlRedirects;
      return this;
    }
  }
}
