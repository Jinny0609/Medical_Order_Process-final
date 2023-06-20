package gmt.medical.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import gmt.medical.model.CategoryInfo;

public interface Cartmapper {
	public void	addcatedata(@Param("product_id") int productId, @Param("product_name") String productName, @Param("product_price") int productPrice, @Param("user_id") int user_id, @Param("cart_option") String name, @Param("product_count") int quantity);

	 public List<CategoryInfo> addToCart(int uesr_id);
}
