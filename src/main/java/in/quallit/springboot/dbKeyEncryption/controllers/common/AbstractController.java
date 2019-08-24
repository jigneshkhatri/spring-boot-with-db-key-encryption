/**
 * 
 */
package in.quallit.springboot.dbKeyEncryption.controllers.common;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.quallit.springboot.dbKeyEncryption.dtos.common.AbstractDTO;
import in.quallit.springboot.dbKeyEncryption.entities.common.AbstractEntity;
import in.quallit.springboot.dbKeyEncryption.entities.common.ResponseBody;
import in.quallit.springboot.dbKeyEncryption.mappers.IAbstractMapper;
import in.quallit.springboot.dbKeyEncryption.services.AbstractService;
import in.quallit.springboot.dbKeyEncryption.utilities.ObjectUtil;

/**
 * The Class AbstractController.
 *
 * @author JIGS
 * @param <E> the element type
 * @param <D> the generic type
 */
@RestController
public abstract class AbstractController<E extends AbstractEntity, D extends AbstractDTO> {

	/**
	 * Save.
	 *
	 * @param obj the obj
	 * @return the response entity
	 */
	@PostMapping
	public ResponseEntity<ResponseBody<D>> save(@RequestBody D obj) {
		return saveOrUpdate(obj);
	}

	/**
	 * Update.
	 *
	 * @param obj the obj
	 * @return the response entity
	 */
	@PutMapping
	public ResponseEntity<ResponseBody<D>> update(@RequestBody D obj) {
		return saveOrUpdate(obj);
	}

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the response entity
	 */
	@GetMapping("/{id}")
	public ResponseEntity<ResponseBody<D>> findById(@PathVariable("id") String id) {
		E obj = getService().findById(id, null);
		D retObj = null;
		if (ObjectUtil.isNotEmpty(obj)) {
			responseCleanUp(obj);
			retObj = getMapper().toDto(obj);
		}
		return ResponseEntity.ok(new ResponseBody<>(retObj));
	}

	/**
	 * Find all.
	 *
	 * @return the response entity
	 */
	@GetMapping
	public ResponseEntity<ResponseBody<Iterable<D>>> findAll() {
		Iterable<E> objs = getService().findAll(null);
		if (ObjectUtil.isNotEmpty(objs)) {
			objs.forEach(single -> responseCleanUp(single));
		}
		Iterable<D> retObjs = getMapper().toDTOIterable(objs);

		return ResponseEntity.ok(new ResponseBody<>(retObjs));
	}

	/**
	 * Save or update.
	 *
	 * @param obj the obj
	 * @return the response entity
	 */
	private ResponseEntity<ResponseBody<D>> saveOrUpdate(D obj) {
		E savedObj = getService().saveOrUpdate(getMapper().toEntity(obj));
		responseCleanUp(savedObj);
		D retObj = getMapper().toDto(savedObj);
		return ResponseEntity.ok(new ResponseBody<>(retObj));
	}

	/**
	 * Gets the service.
	 *
	 * @return the service
	 */
	protected abstract AbstractService<E> getService();

	/**
	 * Gets the mapper.
	 *
	 * @return the mapper
	 */
	protected abstract IAbstractMapper<E, D> getMapper();

	/**
	 * Response clean up.
	 *
	 * @param entity the entity
	 */
	protected abstract void responseCleanUp(E entity);

}
