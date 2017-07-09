/** This program is free: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.user.service;

import java.util.List;

import com.common.entity.User;

/**
 * @author laxman
 *
 */
public interface UserService {

	/**
	 * @param id
	 * @return
	 */
	User findById(long id);

	/**
	 * @param emailId
	 * @return
	 */
	User findByEmailId(String emailId);

	/**
	 * @param user
	 * @return
	 */
	Long saveUser(User user);

	/**
	 * @param user
	 */
	void updateUser(User user);

	/**
	 * @param id
	 */
	void deleteUserById(long id);

	/**
	 * @return
	 */
	List<User> findAllUsers();

	/**
	 * @param user
	 * @return
	 */
	User isUserExist(User user);

}
