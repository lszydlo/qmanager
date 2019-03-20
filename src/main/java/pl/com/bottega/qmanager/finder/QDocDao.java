package pl.com.bottega.qmanager.finder;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface QDocDao extends JpaRepository<QDocReadModel,Long>, JpaSpecificationExecutor<QDocReadModel> {
}
