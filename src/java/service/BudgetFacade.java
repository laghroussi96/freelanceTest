/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Budget;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fatima
 */
@Stateless
public class BudgetFacade extends AbstractFacade<Budget> {

    @PersistenceContext(unitName = "freelanceTestPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BudgetFacade() {
        super(Budget.class);
    }
    
}
