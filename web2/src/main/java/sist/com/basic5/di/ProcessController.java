package sist.com.basic5.di;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component(value="pcl")
@Data
public class ProcessController {
	/*@Setter(onMethod_= {@Resource(name="v1")})
	private ValidateAction vAction;*/
	
	/*@Setter(onMethod_= {@Autowired})
	private ValidateAction vAction;*/
	
	@Setter(onMethod_= {@Inject})
	private ValidateAction vAction;

}
