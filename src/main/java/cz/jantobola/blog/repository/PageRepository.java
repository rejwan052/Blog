package cz.jantobola.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cz.jantobola.blog.domain.StaticPage;

public interface PageRepository extends JpaRepository<StaticPage, Long> {
	
}
