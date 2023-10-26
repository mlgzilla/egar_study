package egar.domain.employee;

import egar.domain.employee.dto.EmployeeCriteria;
import egar.domain.employee.entity.Employee;
import egar.util.EMFSingleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeDao {
    private final EntityManagerFactory emf;

    public EmployeeDao() {
        emf = EMFSingleton.getEmf();
    }

    public Optional<Employee> findById(Integer id){
        var em = emf.createEntityManager();
        Employee employee = em.find(Employee.class, id);
        return Optional.ofNullable(employee);
    }

    @SuppressWarnings("unchecked")
    public List<Employee> findByCriteriaWithQuery(EmployeeCriteria search){
        var em = emf.createEntityManager();
        StringBuilder querySql = new StringBuilder("SELECT e FROM EntityDB e ");
        if(search.getId()!=null){
            querySql.append("p.id = :id");
        }
        if(search.getFirstName()!=null){
            querySql.append("p.firstName = :firstName");
        }
        if(search.getMiddleName()!=null){
            querySql.append("p.middleName = :middleName");
        }
        if(search.getSecondName()!=null){
            querySql.append("p.secondName = :secondName");
        }
        if(search.getPhoneNumber()!=null){
            querySql.append("p.phoneNumber = :phoneNumber");
        }
        if(search.getCardNumber()!=null){
            querySql.append("p.cardNumber = :cardNumber");
        }
        if(search.getContractType()!=null){
            querySql.append("p.contractType = :contractType");
        }
        Query query = em.createQuery(String.valueOf(querySql));
        if(search.getId()!=null){
            query.setParameter("id", search.getId());
        }
        if(search.getFirstName()!=null){
            query.setParameter("firstName", search.getFirstName());
        }
        if(search.getMiddleName()!=null){
            query.setParameter("middleName", search.getMiddleName());
        }
        if(search.getSecondName()!=null){
            query.setParameter("secondName", search.getSecondName());
        }
        if(search.getPhoneNumber()!=null){
            query.setParameter("phoneNumber", search.getPhoneNumber());
        }
        if(search.getCardNumber()!=null){
            query.setParameter("cardNumber", search.getCardNumber());
        }
        if(search.getContractType()!=null){
            query.setParameter("contractType", search.getContractType());
        }
        return (List<Employee>) query.getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<Employee> findByCriteriaWithNamedQuery(EmployeeCriteria search) {
        var em = emf.createEntityManager();
        var query = em.createNamedQuery("search");
        query.setParameter("id", search.getId());
        query.setParameter("firstName", search.getFirstName());
        query.setParameter("middleName", search.getMiddleName());
        query.setParameter("secondName", search.getSecondName());
        query.setParameter("phoneNumber", search.getPhoneNumber());
        query.setParameter("cardNumber", search.getCardNumber());
        query.setParameter("contractType", search.getContractType());
        return query.getResultList();
    }

    public List<Employee> findByCriteria(EmployeeCriteria search) {
        var em = emf.createEntityManager();
        var cb = em.getCriteriaBuilder();
        CriteriaQuery<Employee> query = cb.createQuery(Employee.class);
        Root<Employee> root = query.from(Employee.class);
        List<Predicate> conds = new ArrayList<>();
        if (search.getId() != null) {
            conds.add(cb.equal(root.get("id"), search.getId()));
        }
        if (search.getFirstName() != null) {
            conds.add(cb.in(root.get("firstName")).value(search.getFirstName()));
        }
        if (search.getMiddleName() != null) {
            conds.add(cb.equal(root.get("middleName"), search.getMiddleName()));
        }
        if (search.getSecondName() != null) {
            conds.add(cb.equal(root.get("secondName"), search.getSecondName()));
        }
        if (search.getPhoneNumber() != null) {
            conds.add(cb.greaterThanOrEqualTo(root.get("phoneNumber"), search.getPhoneNumber()));
        }
        if (search.getCardNumber() != null) {
            conds.add(cb.lessThan(root.get("cardNumber"), search.getCardNumber()));
        }
        if (search.getContractType() != null) {
            conds.add(cb.lessThan(root.get("contractType"), search.getContractType()));
        }
        query.where(conds.toArray(new Predicate[0]));
        return em.createQuery(query).getResultList();
    }
}
