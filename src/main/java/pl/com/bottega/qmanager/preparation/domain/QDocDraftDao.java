package pl.com.bottega.qmanager.preparation.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.com.bottega.qmanager.shared.QDocId;

import java.util.UUID;

public interface QDocDraftDao extends JpaRepository<QDocDraft, QDocId> {
}
