package com.concretepage.dao;

import com.concretepage.entity.Proposal;
import com.concretepage.entity.ProposalStatus;
import com.concretepage.entity.Tender;

import java.util.List;

/**
 * Created by Admin on 5/5/2017.
 */
public interface ProposalDao {

    public void persist(Proposal proposal);

    public void update(Proposal proposal);

    public Proposal findById(int id);

    public List<Proposal> findByTender(Tender tender);

    public List<Proposal> findByStatus(ProposalStatus proposalStatus);

    public List<Proposal> findAll();

    public boolean delete(Proposal proposal);

    public boolean deleteByProposalID(int proposalID);

}
